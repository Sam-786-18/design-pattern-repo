package com.mhb.factory;

import com.mhb.dao.DAO;

public interface DAOFactory {
public DAO getDAO(String type);
}
