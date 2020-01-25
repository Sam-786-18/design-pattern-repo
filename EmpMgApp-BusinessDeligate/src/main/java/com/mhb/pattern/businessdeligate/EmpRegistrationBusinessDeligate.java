package com.mhb.pattern.businessdeligate;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.mhb.pattern.commons.JDBConfiguration;
import com.mhb.pattern.commons.Log4jConfigurations;
import com.mhb.pattern.dto.EmployeeDTO;
import com.mhb.pattern.exception.EmpAlreadyExistException;
import com.mhb.pattern.exception.InvalidInputsException;
import com.mhb.pattern.exception.ProjectInternalProblem;
import com.mhb.pattern.factory.ConnectionFactory;
import com.mhb.pattern.factory.EmpServiceFactory;
import com.mhb.pattern.service.EmpRegistrationService;
import com.mhb.pattern.vo.EmployeeVO;

public class EmpRegistrationBusinessDeligate {
private static Logger LOG=Logger.getLogger(EmpRegistrationBusinessDeligate.class);
static{
	Log4jConfigurations.Configuration();
}
public String delegateRegister(EmployeeVO vo)throws Exception
{
	EmployeeDTO dto=null;
	EmpRegistrationService service=null;
	int count[]=null;
	boolean flag=false;
	Properties props=null;
	Connection con=null;
	String resultMsg=null;
	try{
		//get Jdbc properties
		props=JDBConfiguration.configureJDBC();
		LOG.debug("gathered jdbc properties from .properties");
		//get Connection
		con=ConnectionFactory.createConnection(props);
		LOG.debug("connection is created");
		System.out.println("connection is created"+con);
		//begin transaction 
		con.setAutoCommit(false);
		LOG.debug("Transaction is created");
		System.out.println("Transaction is created");
	}
	catch(SQLException se){
		System.out.println("------sw"+se.getMessage());
		LOG.error("Problem in creating connection");
		throw new ProjectInternalProblem(se.getMessage());
	}
	//Convert VO class obj DTO class obj (UseCase1)
	dto=new EmployeeDTO();
	dto.setEname(vo.getEname());
	dto.setAddrs(vo.getAddrs());
	dto.setSalary(Integer.parseInt(vo.getSalary()));
	LOG.debug("VO obj is converted into DTO obj");
	System.out.println("----"+dto.toString()+"------------"+vo.toString());
	try{
		//get Service class obj
		service=EmpServiceFactory.getInstance();
		System.out.println("service--called----");
		LOG.debug("service obj is gathered from service Factory");
	}
	catch(Exception e){
		LOG.debug("Problem in getting service class obj");
		throw new ProjectInternalProblem(e.getMessage());//useCase2
	}
	//use DAO
	try{
		System.out.println("============="+dto.getEname());
		count=service.register(con, dto);
		
		if(count==null)
			flag=true;
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==0)
			{
				flag=true;
				break;
			}
		}
	}
	catch(SQLException se){
		LOG.error("problem in using serice class b.method");
		flag=true;
		if(se.getErrorCode()==00001)
			throw new EmpAlreadyExistException(se.getMessage());//useCsae2
		else if(se.getErrorCode()==12899)
			throw new InvalidInputsException(se.getMessage());
	}
	catch(Exception e)
	{
		LOG.fatal("unknown problem using serice class");
		flag=true;
		throw new ProjectInternalProblem(e.getMessage());//useCase2
	}
	finally {
		//perform tx mgmt (Usecase 3)
		if(flag){
			con.rollback();//rollback th tx
			LOG.info("Transaction rolledback");
			resultMsg="Emp registration failed";
		}
		else{
			con.commit();//commit the tx
			LOG.info("Trnsaction commited");
			resultMsg="Emp registration succeded";
		}
		try{
			if(con!=null)
				con.close();
			LOG.info("Connection closed");
			
		}
		catch(SQLException se)
		{
			LOG.error("problem in closing connection");
			throw new ProjectInternalProblem(se.getMessage());
		}
	}
	return resultMsg;
}
}
