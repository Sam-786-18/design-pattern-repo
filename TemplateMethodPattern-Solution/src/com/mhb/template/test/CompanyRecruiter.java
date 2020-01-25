package com.mhb.template.test;

import com.mhb.template.pattern.HiringFresher;
import com.mhb.template.pattern.HiringJavaFresherr;

public class CompanyRecruiter {
public static void main(String[] args) {
	HiringFresher javaFresher=null;
	javaFresher=new HiringJavaFresherr();
	if(javaFresher.recuimentProcess())
		System.out.println("Java Job Seeker Selected");
	else
		System.out.println("Java Job Seeker Not Selected..try after 9 month");
	
}
}
