package cdbPoller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Packet 
{
	private String packetId;
	
	private List<Transaction> transactionList;
	
	/*private PolledPacket polledPacket;
	
	public int getNumeroTransazioni()
	{
		return transactionList != null?transactionList.size():0;
	}*/

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
	
	public Collection<Account> getCustomerSedeList()
	{
		Collection<Account> list = new ArrayList<Account>();
		if (transactionList != null)
		{
			for (Transaction t : transactionList) 
			{
				if (t != null && t.getCustomerSedeList() != null)
				{
					for(Account c: t.getCustomerSedeList())
					{
						if ( c != null && c.getCodice_Sede__c() != null )
						{
							list.add(c);
						}
					}
				}
			}
		}
		return list;
	}
	
	public Packet()
	{}

	/*public PolledPacket getPolledPacket() {
		return polledPacket;
	}

	public void setPolledPacket(PolledPacket polledPacket) {
		this.polledPacket = polledPacket;
	}*/
	
}
