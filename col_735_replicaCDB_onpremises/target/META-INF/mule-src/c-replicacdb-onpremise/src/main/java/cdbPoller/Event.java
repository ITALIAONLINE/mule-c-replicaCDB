package cdbPoller;

import java.util.List;

public class Event 
{
	private String eventName;
	private List<Packet> packets;
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public List<Packet> getPackets() {
		return packets;
	}
	public void setPackets(List<Packet> packets) {
		this.packets = packets;
	}
}
