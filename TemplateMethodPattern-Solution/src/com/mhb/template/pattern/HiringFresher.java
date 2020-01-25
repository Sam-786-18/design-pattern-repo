package com.mhb.template.pattern;

public abstract class HiringFresher {
public boolean conductingAptitudeTest()
{
	System.out.println("Conducting AptitudeTest ");
	return true;
	
}
public boolean conductingGroupDiscussion()
{
	System.out.println("Conducting Group Discussion ");
	return true;
	
}
public boolean conductHRInterview()
{
	System.out.println("Conducting HR Interview ");
	return true;
	
}
public abstract boolean conductTechnicalTest();
public abstract boolean conductTechnicalInterview();
public abstract  boolean conductTechnicalSystemTest();

//template Method
public final boolean recuimentProcess(){
	if(conductingAptitudeTest())
		if(conductingGroupDiscussion())
			if(conductTechnicalTest())
				if(conductTechnicalInterview())
					if(conductTechnicalSystemTest())
						if(conductHRInterview())
							return true;
	return false;
}
}
