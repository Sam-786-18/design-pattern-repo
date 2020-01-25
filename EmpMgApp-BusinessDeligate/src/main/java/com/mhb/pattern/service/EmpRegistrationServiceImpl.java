package com.mhb.pattern.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mhb.pattern.bo.FinanceEmployeeBO;
import com.mhb.pattern.bo.HREmployeeBO;
import com.mhb.pattern.commons.Log4jConfigurations;
import com.mhb.pattern.dao.EmpDAO;
import com.mhb.pattern.dto.EmployeeDTO;
import com.mhb.pattern.factory.EmpDAOFactory;

public class EmpRegistrationServiceImpl implements EmpRegistrationService {
private static Logger LOG=Logger.getLogger(EmpRegistrationServiceImpl.class);
static{
	Log4jConfigurations.Configuration();
}
	@Override
	public int[] register(Connection con, EmployeeDTO dto) throws Exception {
		// TODO Auto-generated method stub
		HREmployeeBO hrBo=null;
		FinanceEmployeeBO fBo=null;
		EmpDAO hrDAO=null,financeDAO;
		int no=0;
		int count[] =null;
		int cnt1=0,cnt2=0;
		try{
			//get DAOs
			hrDAO=EmpDAOFactory.getInstance("hr");
			financeDAO=EmpDAOFactory.getInstance("finance");
			System.out.println("----Hr DAO class----------"+hrDAO.toString()+" finance"+financeDAO.toString());
			LOG.debug("DAO class object are created using DAOFactory");
		}
		catch(Exception se){
			System.out.println("-------DAO class---------"+se.toString());
			LOG.error("Problem in creating DAO class Object"+se.getMessage());
			throw se;
		}
		try{
			//get EMployee no using sequence
			no=hrDAO.getEmpNoByUsingSequence(con);
			System.out.println("get EMployee no using sequence"+no);
			LOG.debug("Emp number generated using sequence");
		}
		catch(SQLException se ){
			System.out.println("---------problem in generated emp number--------"+se.toString());
			LOG.error("-----problem in generated emp number using sequence---------");
		}
		//prepared two bo objects
		hrBo=new HREmployeeBO();
		hrBo.setEmpno(no);
		hrBo.setEname(dto.getEname());
		hrBo.setAddrs(dto.getAddrs());
		System.out.println("-------------hrBo"+hrBo.toString());
		//finance table 
		fBo=new FinanceEmployeeBO();
		fBo.setEmpno(no);
		fBo.setEname(dto.getEname());
		fBo.setAddrs(dto.getAddrs());
		fBo.setSalary(dto.getSalary());
		System.out.println("--------------fBo"+fBo.toString());
		LOG.debug("BO objs created from DTO objs");
		try{
			System.out.println("-----------hkkkk-------------");
			cnt1=hrDAO.insertEmp(con, hrBo);
			System.out.println("=============lllllll-------");
			System.out.println("------"+cnt1);
		    cnt2=financeDAO.insertEmp(con, fBo);
		    System.out.println("-----------ddddd-------------");
		    System.out.println("---------"+cnt2);
		    LOG.debug("BOth DAOs are used to perform persitance operation");
		}
		catch(SQLException se){
			System.out.println("------proble in using dao-----"+se.toString());
			LOG.error("proble in using dao's");
			throw se;
		}
		catch(Exception s){
			LOG.fatal("unknown problem using DAOs");
			System.out.println("-----------------"+s.toString());
			throw s;
			
		}
		count =new  int[2];
		count[0]=cnt1;
		count[1]=cnt2;
		return count;
	
	}

}
