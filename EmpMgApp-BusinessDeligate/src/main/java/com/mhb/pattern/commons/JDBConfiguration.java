package com.mhb.pattern.commons;

import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class JDBConfiguration {
	public static Properties configureJDBC(){
		ResourceBundle bundle=null;
		Set<String> keys=null;
		Properties props;
		//locate Properties file
		bundle=ResourceBundle.getBundle("com/mhb/pattern/commons/jdbc");
		
		//get All keys into collection from properties file
		keys=bundle.keySet();
	    // copy  Properties file content to java.util.Properties class obj through ResoruceBundle
		props=new Properties();
		for(String key:keys){
			props.put(key,bundle.getString(key));
		}//for
		
		System.out.println("prpe"+props.toString());
		return props;
	}//configureLog4J()
}
