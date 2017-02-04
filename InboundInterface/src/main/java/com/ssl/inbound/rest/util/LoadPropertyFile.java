package com.ssl.inbound.rest.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * @author Srikanth
 *
 */
public class LoadPropertyFile
{
	private static Logger logger = Logger.getLogger(LoadPropertyFile.class);
	public static Properties boProperties = null;

	/**
	 * Loads the values from BO properties file
	 * @return Properties
	 */
	public static Properties loadBOProperties() throws Exception
	{
		if(boProperties == null || boProperties.size() == 0)
		{
			String user_Dir = System.getProperty("user.dir");
			String propFileLoc = user_Dir.concat("/orbo_db.properties");

			if(propFileLoc != null)
			{
				boProperties = new Properties();

				try 
				{
					boProperties.load(new FileInputStream(propFileLoc));
				} 
				catch (FileNotFoundException e) 
				{
					logger.error("FileNotFoundException while reading BO properties file: " +e);
					throw e;
				} 
				catch (IOException e) 
				{
					logger.error("IOException while reading BO properties file: " +e);
					throw e;
				}
			}
			else
			{
				logger.error("Unable to Read the BO Properties file as the location is null.");
				throw new Exception("Unable to Read the BO Properties file as the location is null.");
			}
		}

		return boProperties;

	}
	
	/*public static String getValue(String Key) throws Exception
	{
		if(boProperties== null)
		{
			boProperties = loadBOProperties();
		}
		
			return((String)boProperties.get(Key));
		
	}*/

}
