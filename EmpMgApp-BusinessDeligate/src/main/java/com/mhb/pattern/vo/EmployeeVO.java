package com.mhb.pattern.vo;

public class EmployeeVO {
	private String ename;
	private String addrs;
	private String salary;
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeVO [ename=" + ename + ", addrs=" + addrs + ", salary=" + salary + "]";
	}
	
}
