package cdbPoller;

import org.apache.commons.lang3.StringUtils;

public class Utils
{
	public static void log( String message)
	{
		System.out.println("C-CDB001 ----- REPLICACDB ONCLOUD ----- " + StringUtils.stripToEmpty( message ));
	}
}
