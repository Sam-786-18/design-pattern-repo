package com.mhb.dao.pattern.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.mhb.dao.pattern.dto.StudentDTO;
import com.mhb.dao.pattern.factory.StudentServiceFactory;
import com.mhb.dao.pattern.service.StudentService;
import com.mhb.dao.pattern.vo.StudentVO;

public class StudentRegisterController {
private static Logger LOG=Logger.getLogger(StudentRegisterController.class);
static{
	PropertyConfigurator.configure("src/com/mhb/dao/pattern/commons/log4j.properties");
}
public String processDetails(StudentVO vo)throws Exception
{
	StudentService service=null;
	StudentDTO dto=null;
	String regMsg=null;
	//get Service
	service=StudentServiceFactory.getInstance();
	LOG.debug("Service class obj is gathered from ServiceFactory");
	//convert vo obj to DTO obj
	dto=new StudentDTO();
	dto.setSname(vo.getSname());
	dto.setSadd(vo.getSadd());
	dto.setCourses(vo.getCourses());
	dto.setInstitute(vo.getInstitute());
	LOG.debug("VO obj is converted to DTO obj");
	//use Service
	regMsg=service.reigisterStudent(dto);
	LOG.debug("service used in Controller");
	return regMsg;
	}
}
