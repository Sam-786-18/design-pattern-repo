package com.mhb.test;

import com.mhb.afp.DAOFactoryCreater;
import com.mhb.dao.DAO;
import com.mhb.factory.DAOFactory;

public class ClientApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DAO stDAO=null,courseDAO=null;
DAOFactory daoFactory=null;
daoFactory=DAOFactoryCreater.createDAOFactory("excel");
stDAO=daoFactory.getDAO("Student");
stDAO.insert();
courseDAO=daoFactory.getDAO("courses");
courseDAO.insert();
	}

}
