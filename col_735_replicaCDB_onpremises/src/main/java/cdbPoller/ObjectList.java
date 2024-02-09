package cdbPoller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Array;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.commons.lang3.StringUtils;

import oracle.sql.ARRAY;
import oracle.jdbc.OracleConnection;

public class ObjectList 
{
	private List<Object> objectList;
	
	static Logger log = Logger.getLogger(ObjectList.class);
	
	private String env;
	
	public List<String> getStringList()
	{
		List<String> output = new ArrayList<String>();
		
		if ( objectList != null )
		{
			for ( int i = 0; i < objectList.size(); i++ )
			{
				output.add(objectList.get(i).toString());
			}
		}
		
		return output;
	}
	
	public String[] getStringArray()
	{
		//List<String> output = new ArrayList<String>();
		String[] output = new String[objectList.size()];
		
		if ( objectList != null )
		{
			for ( int i = 0; i < objectList.size(); i++ )
			{
				output[i] = objectList.get(i).toString();
			}
		}
		
		return output;
	}
	
	public oracle.sql.ARRAY getOracleSQlArray() throws Exception
	{
		OracleConnection connection = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//connection = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@cdbu01.seat.it:1521:CDBU01","DBACD1CDB","DBACD1CDB");
			try
			{
				connection = getConnectionFromProperties();
			}
			catch ( Exception e )
			{
				connection = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@cdbu01.seat.it:1521:CDBU01","DBACD1CDB","DBACD1CDB");
			}
			if ( connection != null )
			{
				Array arr = connection.createARRAY("DBACD1CDB.ARRAY_TYPE_VARCHAR100", getStringArray());				
				return (ARRAY) arr;
			}
			else throw new Exception("Cannot get connection");
		}
		catch(Exception e)
		{
			throw new Exception(e.getMessage() + ": " + e.getStackTrace());
		}
		finally
		{
			if ( connection != null )
			{
				connection.close();
			}
		}
	}
	
	private OracleConnection getConnectionFromProperties() throws Exception 
	{
		try
		{
			OracleConnection connection = null;
			Properties p = new Properties();
			InputStream i = ObjectList.class.getClassLoader().getResourceAsStream("mule-app.properties");
	        p.load(i);
	        //String env = p.getProperty("mule.env");
			//String env = System.getProperty("mule.env");
			//log.info("C-CDB001-----Poller (CDB -> Cloud)-----env " + env);
			//String propertiesFileName = env + ".properties";
			try
			{
				String propertiesFileName = "app-env-" + env + ".properties";
				//log.info("C-CDB001-----Poller (CDB -> Cloud)-----leggo file " + propertiesFileName);
				Properties prop = new Properties(); 
				InputStream input = null;
				input = ObjectList.class.getClassLoader().getResourceAsStream(propertiesFileName); 
				//log.info("aperto inputstream");
				prop.load(input);
				//log.info("C-CDB001-----Poller (CDB -> Cloud)-----properties " + propertiesFileName + " -> " + prop.size() + " keys");
				connection = (OracleConnection) DriverManager.getConnection("jdbc:oracle:thin:@" + prop.getProperty("cdb.host") + ":" + prop.getProperty("cdb.port") + ":" + prop.getProperty("cdb.instance"),prop.getProperty("cdb.user"),prop.getProperty("cdb.password"));
			}
			catch ( Exception e )
			{
				//e.printStackTrace();
				log.error( "C-CDB001-----Poller (CDB -> Cloud)-----Error in getConnectionFromProperties: " + e.getMessage() + " - " + e.getStackTrace() );
				throw e;
			}
		    //log.info("C-CDB001-----Poller (CDB -> Cloud)-----Got connection -> " + ((connection != null && connection.getUserName() != null)?"OK":"KO"));
			return connection;
		}
		catch(Exception e)
		{
			log.error( "C-CDB001-----Poller (CDB -> Cloud)-----Error in getConnectionFromProperties: " + e.getMessage() + " - " + e.getStackTrace() );
			throw e;
		}
	}
	
	public List<Object> getObjectList() {
		return objectList;
	}
	
	public String getTransactions()
	{
		String[] arr = getStringArray();
		if ( arr != null && arr.length > 0 )
		{
			return StringUtils.join( arr, ',' );
		}
		else return "";
	}

	public void setObjectList(List<Object> objectList) throws SQLException, Exception {
		this.objectList = objectList;
		//log.info("C-CDB001-----Poller (CDB -> Cloud)-----got ObjectList with size " + (( objectList != null )?objectList.size():0) );
		//log.info("C-CDB001-----Poller (CDB -> Cloud)-----OracleSQlArray size " + getOracleSQlArray().length());
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}
}
