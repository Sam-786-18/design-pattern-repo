package com.mhb.dao.pattern.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
private String sname;
private String sadd;
private String courses;
private String institute;
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSadd() {
	return sadd;
}
public void setSadd(String sadd) {
	this.sadd = sadd;
}
public String getCourses() {
	return courses;
}
public void setCourses(String courses) {
	this.courses = courses;
}
public String getInstitute() {
	return institute;
}
public void setInstitute(String institute) {
	this.institute = institute;
}
@Override
public String toString() {
	return "StudentDTO [sname=" + sname + ", sadd=" + sadd + ", courses=" + courses + ", institute=" + institute + "]";
}

}
