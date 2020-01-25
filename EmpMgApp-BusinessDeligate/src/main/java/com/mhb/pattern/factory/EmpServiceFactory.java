package com.mhb.pattern.factory;

import org.apache.log4j.Logger;

import com.mhb.pattern.commons.Log4jConfigurations;
import com.mhb.pattern.service.EmpRegistrationService;
import com.mhb.pattern.service.EmpRegistrationServiceImpl;

public class EmpServiceFactory {
private static Logger LOG=Logger.getLogger(EmpServiceFactory.class);
static{
	Log4jConfigurations.Configuration();
}
public static EmpRegistrationService getInstance(){
	LOG.debug("EmpRegistrationService has created Service class obj");
	return new EmpRegistrationServiceImpl();
}
}
