package com.mhb.pattern.service;

import java.sql.Connection;

import com.mhb.pattern.dto.EmployeeDTO;

public interface EmpRegistrationService {
public int [] register (Connection con,EmployeeDTO dto)throws Exception;
}
