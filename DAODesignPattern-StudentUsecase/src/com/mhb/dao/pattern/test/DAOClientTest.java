package com.mhb.dao.pattern.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.mhb.dao.pattern.controller.StudentRegisterController;
import com.mhb.dao.pattern.vo.StudentVO;

public class DAOClientTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=null;
String name=null,sadd=null,courses=null,institute=null;
StudentVO vo=null;
StudentRegisterController controller=null;
//read inputs
sc=new Scanner(System.in);
System.out.println("Enter name");
name=sc.next();
System.out.println("Enter Address");
sadd=sc.next();
System.out.println("Enter courses");
courses=sc.next();
System.out.println("Enter Institute");
institute=sc.next();

//prepare vo having inputs
vo=new StudentVO();
vo.setSname(name);
vo.setSadd(sadd);
vo.setCourses(courses);
vo.setInstitute(institute);
//get Controller obj 
controller=new StudentRegisterController();
try{
	System.out.println(controller.processDetails(vo));
}
catch(SQLException se)
{
	se.printStackTrace();
}
catch(Exception e){
	e.printStackTrace();
}
	}
}
