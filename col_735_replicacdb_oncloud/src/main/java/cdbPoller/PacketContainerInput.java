package cdbPoller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PacketContainerInput 
{
	private String ExecutionDate;

	private ArrayList<Event> SimplePackets;

	private ArrayList<Packet> Packets;

	public Collection<Account> getSimpleCustomerSedeList()
	{
		Collection<Account> list = new ArrayList<Account>();
		if ( SimplePackets != null && SimplePackets.size() > 0 )
		{
			for (Event e : SimplePackets)
			{
				if ( e != null && e.getPackets() != null )
				{
					for (Packet p : e.getPackets())
					{
						if ( p != null && p.getTransactionList() != null )
						{
							for (Transaction t : p.getTransactionList()) 
							{
								if (t != null && t.getCustomerSedeList() != null)
								{
									for(Account c: t.getCustomerSedeList())
									{
										if ( c != null && c.getCodice_Sede__c() != null)
										{
											list.add(c);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return list;
	}
	
	public List<String> getComplexPacketsTransactionsId()
	{
		List<String> list = new ArrayList<String>();
		try
		{
			if ( Packets != null && Packets.size() > 0 )
			{
				for (Packet p : Packets)
				{
					if ( p != null && p.getTransactionList() != null )
					{
						for (Transaction t : p.getTransactionList()) 
						{
							list.add( t.getTransactionId() );
						}
					}
				}
			}
		}
		catch ( Exception e )
		{
			Utils.log( "Error in getComplexPacketsTransactionsId: " + e.getMessage() + " - " + e.getStackTrace() );
		}
		return list;
	}
	
	public void logTransactionIds()
	{
		try
		{
			List<String> c = getComplexPacketsTransactionsId();
			
			if ( c != null && c.size() > 0 )
			{
				Utils.log( "Ci sono " + c.size() + " transactionId appartenenti a pacchetti complessi: " + String.join( ",", c ) );
			}
			
			if ( SimplePackets != null && SimplePackets.size() > 0 )
			{
				for ( Event e : SimplePackets )
				{
					if ( e != null && e.getPackets() != null && e.getPackets().size() > 0 )
					{
						List<String> list = new ArrayList<String>();
						for( Packet p : e.getPackets() )
						{
							if ( p != null && p.getTransactionList() != null && p.getTransactionList().size() > 0 )
							{
								for ( Transaction t : p.getTransactionList() )
								{
									if ( t != null && t.getTransactionId() != null && t.getTransactionId().length() > 0 )
									{
										list.add( t.getTransactionId() );
										/*if ( t.getCustomerSedeList() != null && t.getCustomerSedeList().size() > 0 )
										{
											for ( Account a : t.getCustomerSedeList() )
											{
												Utils.log(a.toString());
											}
										}*/
									}
								}
							}
						}
						Utils.log( "Evento " + e.getEventName() + ", " + list.size() + " transazioni: " + String.join( ",", list ) );
					}
				}
			}
		}
		catch ( Exception e )
		{
			Utils.log( "Error in logTransactionIds: " + e.getMessage() + " - " + e.getStackTrace() );
		}
	}

	public Collection<Packet> GetSimplePacketsByEvent(String eventName)
	{
		if ( eventName != null && eventName.length() > 0 )
		{
			for(Event e : SimplePackets)
			{
				if ( eventName.equalsIgnoreCase(e.getEventName()) )
				{
					return e.getPackets();
				}
			}
		}
		return new ArrayList<Packet>();
	}
	
	public boolean hasSimplePackets()
	{
		return SimplePackets != null && SimplePackets.size() > 0;
	}

	public boolean hasPackets()
	{
		return Packets != null && Packets.size() > 0;
	}
	
	public int numberOfSimplePackets()
	{
		return getSimpleCustomerSedeList().size();
	}
	
	public int numberOfPackets()
	{
		return (Packets != null)?Packets.size():0;
	}

	public String getExecutionDate() {
		return ExecutionDate;
	}

	public void setExecutionDate(String executionDate) {
		ExecutionDate = executionDate;
	}

	public ArrayList<Event> getSimplePackets() {
		return SimplePackets;
	}

	public void setSimplePackets(ArrayList<Event> simplePackets) {
		SimplePackets = simplePackets;
	}

	public ArrayList<Packet> getPackets() {
		return Packets;
	}

	public void setPackets(ArrayList<Packet> packets) {
		Packets = packets;
	}


}
