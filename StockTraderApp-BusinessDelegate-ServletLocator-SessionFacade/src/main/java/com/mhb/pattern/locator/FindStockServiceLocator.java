package com.mhb.pattern.locator;

import java.util.HashMap;
import java.util.Map;

import com.mhb.pattern.sessionfacade.external4.FindStockValueFacade;
import com.mhb.pattern.sessionfacade.external4.FindStockValueFacadeImpl;

public class FindStockServiceLocator {
private static final Map<String,FindStockValueFacade> cache=new HashMap<>();
private static FindStockServiceLocator instance;
private FindStockServiceLocator() {
	// no operation
}

public static FindStockServiceLocator getInstance()
{
if(instance==null)
{
synchronized (FindStockServiceLocator.class)
{
	if(instance==null)
	{
		instance=new FindStockServiceLocator();
	}
}//if

}//synchronized
return instance;
}//


public FindStockValueFacade getservice(String jndiName)
{
FindStockValueFacade facade=null;
if(!cache.containsKey(jndiName))
{
//actually we should jndi Lookup code
	System.out.println("if------"+jndiName);
	facade=new FindStockValueFacadeImpl();
	//put in cache
	cache.put(jndiName, facade);
}
else{
	System.out.println("--exist----"+jndiName);
	cache.get(jndiName);
    }
return cache.get(jndiName);
}
}//method
