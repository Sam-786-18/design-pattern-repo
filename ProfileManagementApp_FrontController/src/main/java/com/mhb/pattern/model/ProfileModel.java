package com.mhb.pattern.model;

public class ProfileModel {
	public ProfileModel() {
		System.out.println("-------------ProfileModel--------------");
	}
private int pid;
private String country;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
