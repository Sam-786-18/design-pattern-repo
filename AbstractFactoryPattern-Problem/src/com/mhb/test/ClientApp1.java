package com.mhb.test;

import com.mhb.dao.DAO;
import com.mhb.factory.DBDaoFactory;

public class ClientApp1 {
public static void main(String[] args) {
	DAO stDAO=null,courseDAO=null;
	stDAO=DBDaoFactory.getDAO("student");
	
	stDAO.insert();
	courseDAO=DBDaoFactory.getDAO("courses");
	courseDAO.insert();
}
}
