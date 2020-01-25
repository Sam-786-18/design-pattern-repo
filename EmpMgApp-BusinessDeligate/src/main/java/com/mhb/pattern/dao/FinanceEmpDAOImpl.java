package com.mhb.pattern.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mhb.pattern.bo.FinanceEmployeeBO;
import com.mhb.pattern.bo.HREmployeeBO;
import com.mhb.pattern.commons.Log4jConfigurations;

public class FinanceEmpDAOImpl implements EmpDAO {
	
private static Logger LOG=Logger.getLogger(FinanceEmpDAOImpl.class);
private static final String INSERT_FINANCE_EMP="INSERT INTO FINANCE_EMP VALUES(?,?,?,?)";

static{
	Log4jConfigurations.Configuration();
}
	@Override
	public int insertEmp(Connection con, HREmployeeBO hrBo) throws SQLException {
		PreparedStatement ps=null;
		int count=0;
		FinanceEmployeeBO fBO=null;
		try{
			//create PrepparedStatement object
			System.out.println("--------INSERT_FINANCE_EMP-----");
			ps=con.prepareStatement(INSERT_FINANCE_EMP);
			LOG.debug("Preparedstament object is created");
			//set values to Query params
			fBO=(FinanceEmployeeBO) hrBo;
			ps.setInt(1, fBO.getEmpno());
			ps.setString(2, fBO.getEname());
			ps.setString(3, fBO.getAddrs());
			ps.setFloat(4, fBO.getSalary());
			LOG.debug("values are set to query params");
			//execute the query
			count=ps.executeUpdate();
			LOG.debug("query executed........");
		}
		catch(SQLException se){
			LOG.error("problem in insert Query execution");
	    	   throw se;
	    	   
	       }
	       catch(Exception e){
	    	   LOG.fatal("Unknown Problem");
	    	   throw e;
	       }
	       finally{
	    	 try{  
	    	  if(ps!=null)
	    		  ps.close();
	    	   LOG.debug("PreparedStatement obj is closed");
	    	 }
	    	 catch(SQLException se){
	    		 LOG.error("Problem in closing PreparedStatement obj");	 
	    		 throw se;
	    	 }
	       }//finally
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public int getEmpNoByUsingSequence(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
