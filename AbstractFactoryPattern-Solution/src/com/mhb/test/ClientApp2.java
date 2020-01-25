package com.mhb.test;

import com.mhb.afp.DAOFactoryCreater;
import com.mhb.commons.FactoryType;
import com.mhb.dao.DAO;
import com.mhb.factory.DAOFactory;

public class ClientApp2 {
	public static void main(String[] args) {
		DAO stDAO=null ,couresDAO=null;
		DAOFactory daoFactory=null;
		//daoFactory=DAOFactoryCreater.createDAOFactory(FactoryType.FACTORY_STORE_DB);
		daoFactory=DAOFactoryCreater.createDAOFactory(FactoryType.FACTORY_STORE_EXCEL);
		stDAO=daoFactory.getDAO(FactoryType.DAO_TYPE_STUDENT);
		stDAO.insert();
		couresDAO=daoFactory.getDAO(FactoryType.DAO_TYPE_COURSES);
		couresDAO.insert();
		
	

	}

}
