/**
 * 
 */
package com.ssl.inbound.rest.db.beans.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

import org.apache.log4j.Logger;

import com.ssl.inbound.rest.util.LoadPropertyFile;

/**
 * @author Srikanth
 *
 */
public class DBConnection 
{
	private static Logger logger = Logger.getLogger(DBConnection.class);

	private static Connection connection = null;

	/**
	 * Gets the BO Database Connection
	 * @return Connection
	 * @throws Exception
	 */
	public static Connection getBODBConnection() throws Exception
	{
		if(connection == null || connection.isClosed())
		{
			Properties boProperties = LoadPropertyFile.loadBOProperties();

			if(boProperties != null && boProperties.size() > 0)
			{
				if(boProperties.getProperty("inst.db.jdbc-url") != null && boProperties.getProperty("inst.db.owner.user") != null 
						&& boProperties.getProperty("inst.db.owner.password") != null && ! boProperties.getProperty("inst.db.jdbc-url").trim().equals("") 
						&& ! boProperties.getProperty("inst.db.owner.user").trim().equals("") 
						&& ! boProperties.getProperty("inst.db.owner.password").trim().equals(""))
				{
					try
					{
						DriverManager.registerDriver(new OracleDriver());

						connection = DriverManager.getConnection(boProperties.getProperty("inst.db.jdbc-url"), boProperties.getProperty("inst.db.owner.user"), boProperties.getProperty("inst.db.owner.password"));
					}
					catch(SQLException sqlException)
					{
						logger.error("SQLException while getting CO DB Connection: " +sqlException);
						throw sqlException;
					}
					catch(Exception exception)
					{
						logger.error("Exception while getting CO DB Connection: " +exception);
						throw exception;
					}
				}
				else
				{
					logger.error("Input Parameters is/are null while getting the CO DB Connection.");
					throw new Exception("Input Parameters is/are null while getting the CO DB Connection.");
				}
			}
		}

		return connection;
	}

	/**
	 * Closes the input connection
	 * @param connection
	 * @throws Exception
	 */
	public static void closeConnection(Connection connection) throws Exception
	{
		if(connection != null)
		{
			try 
			{
				connection.close();
			} 
			catch (SQLException exception) 
			{
				logger.error("Exception while closing the CO DB Connection: " +exception);
				throw exception;
			}
		}
	}
}
