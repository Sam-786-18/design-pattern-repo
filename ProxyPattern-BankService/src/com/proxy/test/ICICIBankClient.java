package com.proxy.test;

import com.proxy.factory.BankServiceFactory;
import com.proxy.service.BankService;

public class ICICIBankClient {
	public static void main(String[] args) {
		BankService service=null;
		//use Factory 
		service=BankServiceFactory.getInstance(false);
		System.out.println(service.withdraw(10001, 220000));
		System.out.println(service.deposit(1002, 220000));
		System.out.println(service.tranferMoney(1001, 1002, 250000));
		System.out.println("class name:: "+service.getClass());
		System.out.println("-----------------------------------------------");
		service=BankServiceFactory.getInstance(true);
		System.out.println(service.withdraw(10001, 220000));
		System.out.println(service.deposit(1002, 220000));
		System.out.println(service.tranferMoney(1001, 1002, 250000));
		System.out.println("class name:: "+service.getClass());
	}

}
