package com.mhb.factory;

import com.mhb.dao.DAO;
import com.mhb.dao.DBCoursesDAOImpl;
import com.mhb.dao.DBStudentDAOImpl;

public class DBDaoFactory {
public static DAO getDAO(String type){
	DAO dao=null;
	if(type.equalsIgnoreCase("student"))
	{
		dao=new DBStudentDAOImpl();
		
	}
	else if(type.equalsIgnoreCase("courses"))
	{
		dao=new DBCoursesDAOImpl();
		
	}
	else{
		throw new IllegalArgumentException("Did not match");
	}
	return dao;
}
}
