package com.mhb.pattern.commons;

import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class Log4jConfigurations {
	
public static void Configuration(){
	ResourceBundle bundle=null;
	Set<String> keys=null;
	Properties props=null;
	//locate Properties  file
	bundle=ResourceBundle.getBundle("com./mhb/pattern/commons/log4j");
	//get all keys into collection from properties file
	keys=bundle.keySet();
	//copy Properties file content to java.util.Properties class obj through ResourceBundle
	props=new Properties();
	for(String key:keys){
		props.put(key, bundle.getObject(key));
	}//for
	//Enable Log4j
}
}
