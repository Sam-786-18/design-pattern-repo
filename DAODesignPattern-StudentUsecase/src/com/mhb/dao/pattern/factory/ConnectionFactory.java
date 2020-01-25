package com.mhb.dao.pattern.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ConnectionFactory {
private static Logger LOG=Logger.getLogger(ConnectionFactory.class);
static{
	PropertyConfigurator.configure("src/com/mhb/dao/pattern/commons/log4j.properties");
}
public static Connection createConnection(String url,String user, String pwd)throws SQLException
{
	Connection con=null;
	try{
	con=DriverManager.getConnection(url,user,pwd);
	LOG.info("Connection established");
	}
	catch (SQLException se) {
		// TODO: handle exception
		LOG.error("connection not established--->"+se.getMessage());
		throw se;
	}
	catch(Exception e){
		LOG.fatal("unknown problem towards established the connection"+e.getMessage());
	}
	return con;
}
}
