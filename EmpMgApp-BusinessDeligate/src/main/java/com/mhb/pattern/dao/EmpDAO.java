package com.mhb.pattern.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.mhb.pattern.bo.HREmployeeBO;

public interface EmpDAO {
public int insertEmp(Connection con,HREmployeeBO hrBo)throws SQLException;
public int getEmpNoByUsingSequence(Connection con)throws SQLException;
}
