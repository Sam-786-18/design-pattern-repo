package com.mhb.dao.pattern.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.mhb.dao.pattern.bo.StudentBO;
import com.mhb.dao.pattern.factory.ConnectionFactory;

public class StudentDAOImpl implements StudentDAO {
	private static Logger LOG=Logger.getLogger(StudentDAOImpl.class);
	private static Properties props;
	private static final String INSERT_STUDENT_QUERY="INSERT INTO DB_STUDENT VALUES(?,?,?,?,?)";
	private static final String GET_SN_BY_SEQUENCE="SELECT DB_STUDENT_SEQ.NEXTVAL FROM DUAL";
static{
	InputStream is=null;

	try {
		//enable log4j logging based log4j.properties file
		PropertyConfigurator.configure("src/com/mhb/dao/pattern/commons/log4j.properties");
	//create Properties class obj having properties collected
		//jdbc.properties
		is=new FileInputStream("src/com/mhb/dao/pattern/commons/jdbc.properties");
		props=new Properties();
		props.load(is);
		LOG.debug("jdbc.properties file content is loaded java.util.Properties class obj ");
	} catch(FileNotFoundException fnf)
	{
		LOG.error("jdbc.properties file not found");
	}
	
	catch (Exception e) {
		// TODO Auto-generated catch block
	LOG.fatal("unknown propblem while jdbc.properties file content");
	}
	
	
}	
@Override
	public int insert(StudentBO bo) throws SQLException {
		// TODO Auto-generated method stub
	Connection con=null;
	PreparedStatement ps=null;
	int result=0;
	//get jdbc connection
	con=ConnectionFactory.createConnection(props.getProperty("jdbc.url"), props.getProperty("jdbc.username"), props.getProperty("jdbc.pwd"));
	LOG.info("jdbc connection established");
		
		ps=con.prepareStatement(INSERT_STUDENT_QUERY);
		//set values to Query params
		ps.setInt(1,getSnoBySequence());
		ps.setString(2, bo.getSname());
		ps.setString(3, bo.getSadd());
		ps.setString(4, bo.getCourses());
		ps.setString(5, bo.getInistitute());
		result=ps.executeUpdate();
		LOG.debug("Query(Insert) Executed");
		return result;
	}
private int getSnoBySequence() throws SQLException
{
Connection con=null;	
PreparedStatement ps=null;
ResultSet rs=null;
int sno=0;
//get jdbc connection
try{
	con=ConnectionFactory.createConnection(props.getProperty("jdbc.url"), props.getProperty("jdbc.username"),props.getProperty("jdbc.pwd"));
	LOG.info("jdbc connection established");
  }
catch(SQLException se)
{
	LOG.error("problem in established connection");
	throw se;
	}
catch(Exception e)
{
	LOG.fatal("unknow problem in established connection");
	throw e;
	}
          //create PreparedStatment obj
try{
	ps=con.prepareStatement(GET_SN_BY_SEQUENCE);
	     //execute Sequence and Dynamic SNO
	    rs=ps.executeQuery();
	     rs.next();
	sno=rs.getInt(1);
	LOG.info("studnet number generated dynamically (sequence)");
}
catch(SQLException se){
	LOG.error("query execution (squence) failed");
}
catch(Exception e){
	LOG.fatal("unknow problem in Query (sequence) execution");
	throw e;
}
finally {
	//close jdbc objs
	try{
		if(rs!=null)
			rs.close();
		LOG.debug("ResultSet obj is closed");
	}
	catch(SQLException se){
		LOG.error("problem in closing ResultSet obj");
		throw se;
	}
	try{
	if(ps!=null)
		ps.close();
	LOG.debug("PreparedStament obj is closed");
	}
	catch(SQLException se)
	{
		LOG.error("Prpblem in closing PrepardStatment");
		throw se;
	}
	try{
		if(con!=null)
			con.close();
		LOG.debug("Connection obj is closed");
	}
	catch(SQLException se)
	{
		LOG.debug("Problem i closing Connection object");
		
	}

}
return sno;
}
}
