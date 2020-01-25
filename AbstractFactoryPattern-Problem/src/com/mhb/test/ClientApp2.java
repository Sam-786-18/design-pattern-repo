package com.mhb.test;

import com.mhb.dao.DAO;
import com.mhb.factory.ExcelDAOFactory;

public class ClientApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DAO stDAO=null,courseDAO=null;
stDAO=ExcelDAOFactory.getType("student");

stDAO.insert();
courseDAO=ExcelDAOFactory.getType("courses");
courseDAO.insert();

	}

}
