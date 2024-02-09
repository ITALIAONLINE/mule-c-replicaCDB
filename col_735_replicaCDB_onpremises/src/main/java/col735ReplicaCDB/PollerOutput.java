package col735ReplicaCDB;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import cdbPoller.Account;
import cdbPoller.CustomerSede;
import cdbPoller.Event;
import cdbPoller.Packet;
import cdbPoller.Transaction;

public class PollerOutput
{
	private String ExecutionDate;
	private List<PollResult> PollResults;
	private List<Event> simplePackets;
	private List<Packet> packets;

	
	
	public String getExecutionDate()
	{
		return ExecutionDate;
	}

	public void setExecutionDate( String executionDate )
	{
		ExecutionDate = executionDate;
	}

	public List<PollResult> getPollResults() {
		return PollResults;
	}
	
	public void setPollResults( List<PollResult> pollResults )
	{
		try
		{
			if ( pollResults != null )
			{
				log("Start setPollResults con " + pollResults.size() + " dati ricevuti da DB." );
				PollResults = pollResults;

				List<Event> events = new ArrayList<Event>();
				List<Packet> packets = new ArrayList<Packet>();

				for( PollResult p : pollResults )
				{
					log("PollResult: " + p.toString());
					if ( p != null && p.getTipo() != null )
					{
						if ( "S".equalsIgnoreCase( p.getTipo() ) )
						{
							AddPollResultToEventList(p, events);
						}
						else if ( "C".equalsIgnoreCase( p.getTipo() ) )
						{
							AddPollResultToPacketList(p, packets);
						}
					}
				}

				this.simplePackets = events;
				this.packets = packets;
				log("[Complessi] Totale pacchetti letti " + packets.size());
				log("[Semplici]  Totale eventi letti " + simplePackets.size() + ": " + String.join( ",", getEventList() ));
				List<String> trs = getTransactionList();
				log("Totale transazioni " + trs.size() + ": " + String.join( ",", trs ));
			}
		}
		catch ( Exception e )
		{
			log("Error in setPollResults: " + e.getMessage() + " - " + e.getStackTrace());
		}
	}
	
	private List<String> getEventList()
	{
		List<String> list = new ArrayList<String>();
		if ( simplePackets != null )
		{
			for( Event e : simplePackets )
			{
				if ( e != null && StringUtils.isNotEmpty( e.getEventName() ) && !list.contains( e.getEventName() ) )
				{
					list.add( e.getEventName() );
				}
			}
		}
		return list;
	}

	private void AddPollResultToPacketList( PollResult poll, List<Packet> packets )
	{
		/*
	 		Pacchetti complessi: 1 pacchetto n > 1 transazioni, collegate dal 'padre'
		 */
		if ( poll != null && StringUtils.isNotEmpty( poll.getPadre() ) )	
		{
			if ( packets.size() > 0 )
			{
				boolean padreFound = false;
				for ( int i = 0; i < packets.size() && !padreFound; i++ )
				{
					Packet p = packets.get( i );
					if ( p != null && StringUtils.isNotEmpty( p.getPadre() ) )
					{
						if ( poll.getPadre().equalsIgnoreCase( p.getPadre() ) )
						{
							padreFound = true;

							/* Potrei avere un record a parita' di transazione (quindi cerco prima se ho tra le transazioni un record a parita' di TransactionId) 
							 * 	-	se lo trovo lo aggiungo alla relativa CustomerSedeList
							 * 	-	se no devo creare un altro oggetto Transaction da aggiungere al Packet	
							 */

							boolean transactionIdFound = false;
							if ( p.getTransactionList() != null )
							{
								for ( int j = 0; j < p.getTransactionList().size() && !transactionIdFound; j++ )
								{
									Transaction t = p.getTransactionList().get( j );
									if ( t != null && StringUtils.isNotEmpty( t.getTransactionId() ) && t.getTransactionId().equalsIgnoreCase( poll.getTransactionId() ) )
									{
										transactionIdFound = true;

										List<CustomerSede> customerSedeList = new ArrayList<CustomerSede>();
										for( Account a : t.getCustomerSedeList() )
										{
											customerSedeList.add( new CustomerSede( a ) );
										}
										
										CustomerSede cs = poll.toCustomerSede();
										customerSedeList.add( cs );
										log("[Complessi] Aggiunto customerSede (Customer/Sede " + cs.customerId + "/" + cs.codiceSede +") a lista per transazione " + t.getTransactionId() + " (size attuale " + customerSedeList.size() + ")");

										t.setCustomerSedeList( customerSedeList );
									}
								}
								if ( !transactionIdFound )
								{
									List<Transaction> transactionList = p.getTransactionList();
									Transaction t = newTransaction( poll );
									CustomerSede cs = poll.toCustomerSede();
									List<CustomerSede> customerSedeList = new ArrayList<CustomerSede>();
									customerSedeList.add( cs );
									t.setCustomerSedeList( customerSedeList );
									transactionList.add( t );
									p.setTransactionList( transactionList );
									
									log("[Complessi] Aggiunta transazione " + t.getTransactionId() + " a pacchetto con GUID " + p.getPacketId() + " (numero transazioni: " + p.getNumeroTransazioni() + ")");
								}
							}
						}
					}
				}
				if ( !padreFound )
				{
					Packet p = newPacket( poll );
					packets.add( p );
					log("[Complessi] Aggiunto packet con GUID " + p.getPacketId() + " (numero transazioni: " + p.getNumeroTransazioni() + ")");
				}
			}
			else
			{
				Packet p = newPacket( poll );
				packets.add( p );
				log("[Complessi] Aggiunto packet con GUID " + p.getPacketId() + " (numero transazioni: " + p.getNumeroTransazioni() + ")");
			}
		}
	}

	private void AddPollResultToEventList( PollResult poll, List<Event> events ) throws Exception
	{
		try
		{
			if ( poll != null && StringUtils.isNotEmpty( poll.getEvento() )  && StringUtils.isNotEmpty( poll.getTransactionId() ))
			{
				if ( events.size() > 0 )
				{
					boolean foundEvent = false;
					for ( int i = 0; i < events.size() && !foundEvent; i++ )
					{
						Event e = events.get( i );
						if ( e != null && StringUtils.isNotEmpty( e.getEventName() ) && poll.getEvento().equalsIgnoreCase( e.getEventName() ) )
						{
							foundEvent = true;
							boolean foundTransaction = false;
							
							/* Adesso cerco se per la stessa transazione ho gia' un record
							 * 		- se si' aggiungo il poll alla corrispondente customerSedeList
							 * 		- se no aggiungo un nuovo pacchetto alla lista degli eventi
							*/
							if ( e.getPackets() != null )
							{
								for ( int j = 0; j < e.getPackets().size() && !foundTransaction; j++ )
								{
									Packet p = e.getPackets().get( j );
									if ( p != null && p.getTransactionList() != null )
									{
										for ( int k = 0; k < p.getTransactionList().size() && !foundTransaction; k++ )
										{
											Transaction t = p.getTransactionList().get( k );
											if ( t != null && StringUtils.isNotEmpty( t.getTransactionId() ) && t.getTransactionId().equalsIgnoreCase( poll.getTransactionId() ) )
											{
												foundTransaction = true;
												
												List<CustomerSede> customerSedeList = new ArrayList<CustomerSede>();
												for( Account a : t.getCustomerSedeList() )
												{
													customerSedeList.add( new CustomerSede( a ) );
												}
												
												CustomerSede cs = poll.toCustomerSede();
												customerSedeList.add( cs );
												log("[Semplici] Aggiunto customerSede (Customer/Sede " + cs.customerId + "/" + cs.codiceSede +") a lista per transazione " + t.getTransactionId() + " (size attuale " + customerSedeList.size() + ")");

												t.setCustomerSedeList( customerSedeList );
											}
										}
									}
								}
								if ( !foundTransaction )
								{
									List<Packet> packetList = e.getPackets();
									Packet p = newPacket( poll );
									packetList.add( p );
									e.setPackets( packetList );
									
									log("[Semplici] Evento " + e.getEventName() + ", aggiunto pacchetto " + p.getPacketId() + " (n. " + e.getPackets().size() + ", con " + p.getNumeroTransazioni() + " transazioni)");
								}
							}
						}
					}
					if ( !foundEvent )
					{
						Event e = newEvent( poll );
						events.add( e );
						log("[Semplici] Aggiunto evento " + e.getEventName() );
					}
				}
				else
				{
					Event e = newEvent( poll );
					events.add( e );
					log("[Semplici] Aggiunto evento " + e.getEventName() );
				}
			}
		}
		catch ( Exception e1 )
		{
			log("Error in AddPollResultToEventList: " + e1.getMessage() + " - " + e1.getStackTrace());
			throw e1;
		}
	}

	private Event newEvent(PollResult poll) throws Exception
	{
		Event e = new Event();
		try
		{
			e.setEventName( poll.getEvento() );

			List<Packet> packetList = new ArrayList<Packet>();

			Packet p = newPacket( poll );

			packetList.add( p );
			e.setPackets( packetList );

			return e;
		}
		catch ( Exception e1 )
		{
			log("Error in newEvent: " + e1.getMessage() + " - " + e1.getStackTrace());
			throw e1;
		}
	}

	private Packet newPacket(PollResult poll)
	{
		Packet p = new Packet();

		List<Transaction> transactionList = new ArrayList<Transaction>();
		List<CustomerSede> customerSedeList = new ArrayList<CustomerSede>();

		p.setPacketId( poll.getGuid() );

		Transaction t = newTransaction( poll );

		CustomerSede cs = poll.toCustomerSede();

		customerSedeList.add( cs );
		t.setCustomerSedeList( customerSedeList );
		transactionList.add( t );
		p.setTransactionList( transactionList );
		p.setPadre( poll.getPadre() );

		return p;
	}

	private Transaction newTransaction(PollResult poll)
	{
		Transaction t = new Transaction();
		t.setSource( "CDBR" );
		t.setEvento( poll.getEvento() );
		t.setTransactionId( poll.getTransactionId() );
		return t;
	}

	public List<String> getTransactionList()
	{
		List<String> list = new ArrayList<String>();
		if ( simplePackets != null )
		{
			for( Event e : simplePackets )
			{
				if ( e != null && e.getPackets() != null )
				{
					for ( Packet p : e.getPackets() )
					{
						if ( p != null && p.getTransactionList() != null )
						{
							for ( Transaction t : p.getTransactionList() )
							{
								if ( t != null && StringUtils.isNotEmpty( t.getTransactionId() ) )
								{
									if ( !list.contains( t.getTransactionId() ) )
									{
										list.add( t.getTransactionId() );
									}
								}
							}
						}
					}
				}
			}
		}
		if ( packets != null )
		{
			for ( Packet p : packets ) 
			{
				if ( p != null && p.getTransactionList() != null )
				{
					for ( Transaction t : p.getTransactionList() )
					{
						if ( t != null && StringUtils.isNotEmpty( t.getTransactionId() ) )
						{
							list.add( t.getTransactionId() );
						}
					}
				}
			}
		}
		return list;
	}

	public void log( String message )
	{
		//System.out.println("C-CDB001 ----- REPLICACDB ONPREMISES ----- " + StringUtils.stripToEmpty( message ));
	}

	public List<Event> getSimplePackets()
	{
		return simplePackets;
	}

	public List<Packet> getPackets()
	{
		return packets;
	}

}
