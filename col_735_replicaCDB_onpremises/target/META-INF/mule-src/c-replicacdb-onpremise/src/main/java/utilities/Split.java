package utilities;

import java.util.Arrays;
import java.util.List;

public class Split {
	
	private String result;
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String[] getTransactions()
	{
		if (result != null && result.length() > 0)
		{
			return result.replace("\"", "").split(",");
		}
		else return new String[0];
	}
	
	public List<String> getTransactionsList()
	{
		if (result != null && result.length() > 0)
		{
			return  Arrays.asList(result.replace("\"", "").split(","));
		}
		else return null;
	}

	@Override
	public String toString()
	{
		return " C-CDB001 ONPREMISE-----PLATFORM_EVENT UPDATE CDB -----Split [result=" + result + ", getTransactions()=" + Arrays.toString( getTransactions() ) + ", getTransactionsList()=" + getTransactionsList() + "]";
	}	

}
