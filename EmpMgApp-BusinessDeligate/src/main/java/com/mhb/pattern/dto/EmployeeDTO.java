package com.mhb.pattern.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String ename;
private String addrs;
private float salary;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getAddrs() {
	return addrs;
}
public void setAddrs(String addrs) {
	this.addrs = addrs;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

}
