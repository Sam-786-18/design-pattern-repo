package com.mhb.template.test;

import com.mhb.template.pattern.HiringJavaFresherr;

public class CompanyRecruiter {
public static void main(String[] args) {
	HiringJavaFresherr javaFresherr=null;
	javaFresherr=new HiringJavaFresherr();
	if(javaFresherr.conductAptitudeTest())
		if(javaFresherr.conductGroupDiscssion())
			if(javaFresherr.conductTechnicalTest())
				if(javaFresherr.conductTechnicalInterview())
					if(javaFresherr.conductTechnicalSystemTest())
						System.out.println("Java JobSeeker is selected");
					else 
						System.out.println("Java JobSeeker is not selected");
}
}
