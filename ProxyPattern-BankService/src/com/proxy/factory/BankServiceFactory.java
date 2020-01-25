package com.proxy.factory;

import com.proxy.proxy.BankServiceProxy;
import com.proxy.service.BankService;
import com.proxy.service.BankServiceImpl;

public class BankServiceFactory {
public static BankService getInstance(boolean RBIMontoring)
{
	BankService service=null;
	if(RBIMontoring)
	      {
		service=new BankServiceProxy();
	    }
	else
	     {
			service=new BankServiceImpl();
	    }
	return service;
}
}
