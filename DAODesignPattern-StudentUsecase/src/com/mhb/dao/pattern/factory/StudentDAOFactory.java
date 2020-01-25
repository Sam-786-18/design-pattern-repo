package com.mhb.dao.pattern.factory;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.mhb.dao.pattern.dao.StudentDAO;
import com.mhb.dao.pattern.dao.StudentDAOImpl;

public class StudentDAOFactory {
private static Logger LOG=Logger.getLogger(StudentDAOFactory.class);
static{
	PropertyConfigurator.configure("src/com/mhb/dao/pattern/commons/log4j.properties");
}
public static StudentDAO getInstance(){
	LOG.info("DAOFactory has DAO obj");
return new StudentDAOImpl();
}//method
}
