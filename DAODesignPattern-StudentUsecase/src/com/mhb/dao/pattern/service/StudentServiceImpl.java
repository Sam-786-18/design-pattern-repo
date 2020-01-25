package com.mhb.dao.pattern.service;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.mhb.dao.pattern.bo.StudentBO;
import com.mhb.dao.pattern.dao.StudentDAO;
import com.mhb.dao.pattern.dto.StudentDTO;
import com.mhb.dao.pattern.factory.StudentDAOFactory;

public class StudentServiceImpl implements StudentService {
private static Logger LOG=Logger.getLogger(StudentServiceImpl.class);
static{
	PropertyConfigurator.configure("src/com/mhb/dao./pattern/commons/log4j.properties");
}
	@Override
	public String reigisterStudent(StudentDTO dto) throws Exception {
		// TODO Auto-generated method stub
		StudentDAO dao=null;
		StudentBO bo=null;
		int result=0;
		//get DAO
		dao=StudentDAOFactory.getInstance();
		LOG.debug("convert DTO to BO object");
		bo=new StudentBO();
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		bo.setCourses(dto.getCourses());
		bo.setInistitute(dto.getInstitute());
		LOG.debug("DTO obj is converted to BO object");
		//use dao
		result=dao.insert(bo);
		if(result==0)
			return "Student registration failed";
		else
		return "Student registration succeded";
	}

}
