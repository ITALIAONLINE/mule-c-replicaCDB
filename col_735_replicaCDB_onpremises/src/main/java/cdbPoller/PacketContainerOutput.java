package cdbPoller;

import java.util.ArrayList;
import java.util.List;

public class PacketContainerOutput 
{
	private String ExecutionDate;
	
	private List<Packet> PacketList;

	public String getExecutionDate() {
		return ExecutionDate;
	}

	public void setExecutionDate(String executionDate) {
		ExecutionDate = executionDate;
	}

	public void setPacketList(List<Packet> packetList) {
		PacketList = packetList;
	}
	
	private List<Packet> getSimplePackets2()
	{
		List<Packet> packets = new ArrayList<Packet>();
		
		if ( PacketList != null && PacketList.size() > 0 )
		{
			for (Packet packet : PacketList) 
			{
				if ( packet != null && packet.getNumeroTransazioni() == 1 )
				{
					Transaction t = packet.getTransactionList().get(0);
					if ( t != null && t.getNumeroOperazioni() >= 1 )
					{
						//CustomerSede cs = t.getCustomerSedeList().get(0);
						Account a = t.getCustomerSedeList().get(0);
						//if ( cs != null && cs.codiceSede != null )
						if ( a != null && a.getCodice_Sede__c() != null )
						{
							packets.add(packet);
						}
					}
				}
			}
		}
		return packets;
	}
	
	public List<Event> getSimplePackets()
	{
		List<Event> events = new ArrayList<Event>();
		List<Packet> simplePackets = getSimplePackets2();
		
		if ( PacketList != null && PacketList.size() > 0 )
		{
			for (Packet packet : simplePackets) 
			{
				Transaction t = packet.getTransactionList().get(0);
				String event = t.getEvento();
				if ( event != null && event.length() > 0 )
				{
					boolean found = false;
					for( Event e: events )
					{
						if ( e != null && event.equalsIgnoreCase(e.getEventName())  )
						{
							found = true;
							List<Packet> p = e.getPackets();
							p.add(packet);
							e.setPackets(p);
						}
					}
					if ( !found )
					{
						Event ev = new Event();
						ev.setEventName(event);
						List<Packet> p = new ArrayList<Packet>();
						p.add(packet);
						ev.setPackets(p);
						events.add(ev);
					}
				}
			}
		}
		
		return events;
	}
	
	public List<Packet> getPackets()
	{
		List<Packet> packets = new ArrayList<Packet>();
		List<Packet> simplePackets = getSimplePackets2();
		
		if ( simplePackets != null && simplePackets.size() == 0  )
		{
			return PacketList;
		}
		
		if ( PacketList != null && PacketList.size() > 0 && simplePackets.size() > 0 )
		{
			for (Packet packet : PacketList) 
			{
				if ( packet != null && !simplePackets.contains(packet) )
				{
					packets.add(packet);
				}
			}
		}
		return packets;
	}
}
