package com.mhb.pattern.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mhb.pattern.bo.HREmployeeBO;
import com.mhb.pattern.commons.Log4jConfigurations;

public class HREmpDAOImpl implements EmpDAO {
	private static Logger LOG=Logger.getLogger(HREmployeeBO.class);
	private static final String INSERT_HREMP="INSERT INTO HR_EMP VALUES(?,?,?)";
	private static String GET_EMPNO_BY_SEQUENCE="SELECT DP_EMP_NO_SEQ.NEXTVAL FROM DUAL";

	static{
		Log4jConfigurations.Configuration();
	}
	@Override
	public int insertEmp(Connection con, HREmployeeBO hrBo) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps=null;
		int count=0;
		try{
			//create PreparedsStatemnt object
			ps=con.prepareStatement(INSERT_HREMP);
			System.out.println("gggggggggggg"+con);
			LOG.debug("PreparedStament object is created");
			//set values to Query params
			ps.setInt(1, hrBo.getEmpno());
			ps.setString(2, hrBo.getEname());
			ps.setString(3, hrBo.getAddrs());
			LOG.debug("values are set to query"+ps.toString());
			//execute the query
			count=ps.executeUpdate();
			LOG.debug("Query executed--------");
		}
		catch(SQLException se)
		{
			LOG.debug("problem in insert query execution");
			throw se;
		}
		catch(Exception e){
			LOG.fatal("Uknown Problem");
			throw e;
		}
		finally{
			try{
				if(ps!=null)
					ps.close();
				LOG.debug("Preparedstament obj is closed");
			}
			catch(SQLException se){
				LOG.error("Problem in closing PreparedStament obj");
				throw se;
			}
		}
		return count;
	}

	@Override
	public int getEmpNoByUsingSequence(Connection con) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps =null;
		ResultSet rs=null;
		int empNo=0;
		try{
			ps=con.prepareStatement(GET_EMPNO_BY_SEQUENCE);
			LOG.debug("PreparedStament obj is created");
			//execute the Query
			rs=ps.executeQuery();
			LOG.debug("Query Execute .....");
			//process the ResultSet
			rs.next();
			empNo=rs.getInt(1);
			LOG.debug("ResultSet obj is processed and Emp no is gathered");
		}
		catch(SQLException se)
		{
			LOG.debug("problem in insert query execution");
			throw se;
		}
		catch(Exception e){
			LOG.fatal("Uknown Problem");
			throw e;
		}
		finally{
			try{
				if(ps!=null)
					ps.close();
				LOG.debug("Preparedstament obj is closed");
			}
			catch(SQLException se){
				LOG.error("Problem in closing PreparedStament obj");
				throw se;
			}
			
		}
		return empNo;
	}
	
}
