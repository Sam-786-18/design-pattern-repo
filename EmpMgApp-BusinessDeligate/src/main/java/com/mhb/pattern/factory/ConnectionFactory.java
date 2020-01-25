package com.mhb.pattern.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.mhb.pattern.commons.Log4jConfigurations;

public class ConnectionFactory {
private static Logger LOG=Logger.getLogger(ConnectionFactory.class);
static{
	Log4jConfigurations.Configuration();
}
public static Connection createConnection(Properties props)throws SQLException,ClassNotFoundException
{

	Connection con=null;
	try{
		Class.forName(props.getProperty("jdbc.driver"));
		con=DriverManager.getConnection(props.getProperty("jdbc.url"),props.getProperty("jdbc.username"),props.getProperty("jdbc.pwd"));
	LOG.debug("Connection established");
	System.out.println("Connection established");
	}
	catch(SQLException se){
		LOG.error("Connection not established->>>"+se.getMessage());
		throw se;
	}
	catch(ClassNotFoundException cnf)
	{
		LOG.error("Problem in loading driver class"+cnf.getMessage());
	}
	catch(Exception e)
	{
		LOG.fatal("Problem in loading driver class->>"+e.getMessage());
		
	}
	return con;
}
}
