package com.mhb.dao.pattern.dao;

import java.sql.SQLException;

import com.mhb.dao.pattern.bo.StudentBO;

public interface StudentDAO {
public int insert(StudentBO bo)throws SQLException;
}
