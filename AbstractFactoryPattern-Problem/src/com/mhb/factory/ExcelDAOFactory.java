package com.mhb.factory;

import com.mhb.dao.DAO;
import com.mhb.dao.ExcelCoursesDetailsDAOImpl;
import com.mhb.dao.ExcelStudentDAOImpl;

public class ExcelDAOFactory {
public static DAO getType(String type){
	DAO dao=null;
	if(type.equalsIgnoreCase("Student"))
	{
		dao=new ExcelStudentDAOImpl();
	}
	else if(type.equalsIgnoreCase("Courses"))
	{
		dao=new ExcelCoursesDetailsDAOImpl();
	}
	else{
		throw new IllegalArgumentException("Did'nt match");
	}
	return dao;
}
}
