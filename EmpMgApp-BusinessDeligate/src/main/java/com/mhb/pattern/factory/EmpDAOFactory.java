package com.mhb.pattern.factory;

import org.apache.log4j.Logger;

import com.mhb.pattern.commons.Log4jConfigurations;
import com.mhb.pattern.dao.EmpDAO;
import com.mhb.pattern.dao.FinanceEmpDAOImpl;
import com.mhb.pattern.dao.HREmpDAOImpl;

public class EmpDAOFactory {
	private static Logger LOG = Logger.getLogger(EmpDAOFactory.class);

	static {
		Log4jConfigurations.Configuration();
	}

	public static EmpDAO getInstance(String type) {
		EmpDAO dao = null;
		if (type.equalsIgnoreCase("hr")) {
			dao = new HREmpDAOImpl();
			LOG.debug("DAOFactory has created DAO class Obj");

		} else if (type.equalsIgnoreCase("finance")) {
			dao = new FinanceEmpDAOImpl();
			LOG.debug("DAOFactory has created DAO class Obj");

		}
		return dao;
	}
}
