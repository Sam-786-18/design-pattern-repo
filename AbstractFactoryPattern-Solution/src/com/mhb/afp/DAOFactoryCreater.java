package com.mhb.afp;

import com.mhb.factory.DAOFactory;
import com.mhb.factory.DBDAOFactory;
import com.mhb.factory.ExcelDAOFatory;

public class DAOFactoryCreater {
public static DAOFactory createDAOFactory(String type)
{
	DAOFactory daoFactory=null;
	if(type.equalsIgnoreCase("DB"))
	{
		System.out.println("creating DBDAOFactory");
		daoFactory=new DBDAOFactory();
	}
	else if(type.equalsIgnoreCase("excel"))
	{
		System.out.println("creating ExcelDAOFactory");
		daoFactory=new ExcelDAOFatory();
	}
	else{
		throw new IllegalArgumentException("Invalid Pattern");
	}
	return daoFactory;
}
}
