package cdbPoller;

import java.util.List;

public class Packet 
{
	private String packetId;
	
	private List<Transaction> transactionList;
	
	private String padre;
	
	//private PolledPacket polledPacket;
	
	public int getNumeroTransazioni()
	{
		return transactionList != null?transactionList.size():0;
	}

	public String getPacketId() {
		return packetId;
	}

	public void setPacketId(String packetId) {
		this.packetId = packetId;
	}

	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
	
	public Packet()
	{}

	public String getPadre()
	{
		return padre;
	}

	public void setPadre( String padre )
	{
		this.padre = padre;
	}

	/*public PolledPacket getPolledPacket() {
		return polledPacket;
	}

	public void setPolledPacket(PolledPacket polledPacket) {
		this.polledPacket = polledPacket;
	}*/
	
}
