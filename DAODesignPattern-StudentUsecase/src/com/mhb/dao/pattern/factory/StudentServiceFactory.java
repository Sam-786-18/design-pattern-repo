package com.mhb.dao.pattern.factory;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.mhb.dao.pattern.service.StudentService;
import com.mhb.dao.pattern.service.StudentServiceImpl;

public class StudentServiceFactory {
private static Logger LOG=Logger.getLogger(StudentServiceFactory.class);
static{
	PropertyConfigurator.configure("src/com/mhb/dao/pattern/commons/log4j.properties");
}
public static StudentService getInstance()throws Exception
{
	LOG.debug("ServiceFactory has created the service obj");
	return new StudentServiceImpl();
	}
}

