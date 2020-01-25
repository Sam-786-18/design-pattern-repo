package com.mhb.pattern.vo;

public class ProfileVO {
	public ProfileVO() {
		// TODO Auto-generated constructor stub
		
		System.out.println("------ProfileVO-----------");
	}
private String profileId;
private String profileName;
private String email;
private String age;
public String getProfileId() {
	return profileId;
}
public void setProfileId(String profileId) {
	this.profileId = profileId;
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
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}

}
