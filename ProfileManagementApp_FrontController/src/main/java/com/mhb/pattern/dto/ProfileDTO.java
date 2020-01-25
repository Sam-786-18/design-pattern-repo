package com.mhb.pattern.dto;

import java.io.Serializable;

public class ProfileDTO implements Serializable {
private int profileid;
private String profileName;
private String email;
int age;
public int getProfileid() {
	return profileid;
}
public void setProfileid(int profileid) {
	this.profileid = profileid;
}
public String getProfileName() {
	return profileName;
}
public void setProfileName(String profileName) {
	this.profileName = profileName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
