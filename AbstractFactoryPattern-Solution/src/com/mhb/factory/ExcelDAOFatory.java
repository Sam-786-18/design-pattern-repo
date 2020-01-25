package com.mhb.factory;

import com.mhb.dao.DAO;
import com.mhb.dao.ExcelCoursesDetailsDAOImpl;
import com.mhb.dao.ExcelStudentDAOImpl;

public class ExcelDAOFatory implements DAOFactory {

	@Override
	public DAO getDAO(String type) {
		DAO dao=null;
		if(type.equalsIgnoreCase("student"))
		{
			dao=new ExcelStudentDAOImpl();
		}
		else if(type.equalsIgnoreCase("courses"))
		{
			dao=new ExcelCoursesDetailsDAOImpl();
		}
		else{
			throw new IllegalArgumentException("Invalid Type");
		}
		// TODO Auto-generated method stub
		return dao;
	}

}
