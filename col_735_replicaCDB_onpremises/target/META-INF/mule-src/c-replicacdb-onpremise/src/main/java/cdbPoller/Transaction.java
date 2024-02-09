package cdbPoller;

import java.util.ArrayList;
import java.util.List;

public class Transaction 
{
	private String TransactionId;
	
	private String Source;
	
	private List<CustomerSede> CustomerSedeList;

	private String Evento;
	
	public int getNumeroOperazioni()
	{
		return CustomerSedeList != null?CustomerSedeList.size():0;
	}
	
	public Transaction() {}
	
	public String getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}

	/*public List<CustomerSede> getCustomerSedeList() {
		return CustomerSedeList;
	}*/
	
	public List<Account> getCustomerSedeList() 
	{
		List<Account> result = new ArrayList<Account>();
		if ( CustomerSedeList != null && CustomerSedeList.size() > 0 )
		{
			for (CustomerSede cs : CustomerSedeList) 
			{
				if ( cs != null && cs.codiceSede != null )
				{
					result.add(new Account(cs));
				}
			}
		}
		return result;
	}

	public void setCustomerSedeList(List<CustomerSede> customerSedeList) {
		CustomerSedeList = customerSedeList;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getEvento() {
		return Evento;
	}

	public void setEvento(String evento) {
		Evento = evento;
	}
}
