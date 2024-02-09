package cdbPoller;

public class PolledPacket 
{
	private String id;
	
	private String packet;
	
	private String packetDate;
	
	private String rank;
	
	public String[] getTransactions()
	{
		if (packet != null && packet.length() > 0)
		{
			return packet.split(",");
		}
		else return new String[0];
	}
	
	public String getLog()
	{
		try {
			return "Packet " + rank + " (id: " + id + ", data: " + packetDate + "), " + getTransactions().length + " transazioni: " + packet;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}

	public String getPacket() {
		return packet;
	}

	public void setPacket(String packet) {
		this.packet = packet;
	}

	public String getPacketDate() {
		return packetDate;
	}

	public void setPacketDate(String packetDate) {
		this.packetDate = packetDate;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
