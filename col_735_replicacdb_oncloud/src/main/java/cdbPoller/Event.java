package cdbPoller;

import java.util.List;

public class Event 
{
	private String eventName;
	private List<Packet> packets;
	private boolean done;
	
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
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString()
	{
		return "Event [eventName=" + eventName + ", packets=" + ((packets != null)?packets.size():0) + "]";
	}
}
