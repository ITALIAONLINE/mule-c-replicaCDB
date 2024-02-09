package cdbPoller;


import java.util.List;

public class PacketContainer 
{
	private String ExecutionDate;
	
	private List<Packet> PacketList;
	
	/*public int getNumeroPacchetti()
	{
		return PacketList != null?PacketList.size():0;
	}*/

	public String getExecutionDate() {
		return ExecutionDate;
	}

	public void setExecutionDate(String executionDate) {
		ExecutionDate = executionDate;
	}

	public List<Packet> getPacketList() {
		return PacketList;
	}

	public void setPacketList(List<Packet> packetList) {
		PacketList = packetList;
	}
}
