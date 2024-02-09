package cdbPoller;

import java.util.List;

public class Transaction
{
	private String TransactionId;
	
	private String Fonte;
	
	private List<Account> CustomerSedeList;

	private String Evento;
	
	/*public int getNumeroOperazioni()
	{
		return CustomerSedeList != null?CustomerSedeList.size():0;
	}*/
	
	public Transaction() {}
	
	public String getTransactionId() {
		return TransactionId;
	}

	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}

	public List<Account> getCustomerSedeList() {
		return CustomerSedeList;
	}

	public void setCustomerSedeList(List<Account> customerSedeList) {
		CustomerSedeList = customerSedeList;
	}

	public String getFonte() {
		return Fonte;
	}

	public void setFonte(String fonte) {
		Fonte = fonte;
	}

	public String getEvento() {
		return Evento;
	}

	public void setEvento(String evento) {
		Evento = evento;
	}
}
