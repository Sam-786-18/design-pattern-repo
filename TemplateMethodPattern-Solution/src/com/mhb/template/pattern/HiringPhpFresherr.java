package com.mhb.template.pattern;

public class HiringPhpFresherr extends HiringFresher {
	
	public boolean conductTechnicalTest()
	{
		System.out.println("Conducting TechnicalTest");
		return true;
	}
	public boolean conductTechnicalInterview()
	{
		System.out.println("Conducting PHP TechnicalInterview(1-1)");
		return true;
	}
	
	public boolean conductTechnicalSystemTest()
	{
		System.out.println("Conducting PHP System Test");
		return true;
	}
	
}
