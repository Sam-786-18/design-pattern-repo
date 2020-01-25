package com.proxy.proxy;

import com.proxy.service.BankService;
import com.proxy.service.BankServiceImpl;

public class BankServiceProxy implements BankService{

	BankService target=null;
	public BankServiceProxy() {
		System.out.println("Proxy class");
	target=new BankServiceImpl();	
	}
	@Override
	public String withdraw(int accno, float amt) {
		String withdrawMsg=null;
		if(amt>=20000)
			amt=amt-(amt*0.3f);
		//use target class
		withdrawMsg=target.withdraw(accno, amt);
		
		return withdrawMsg;
	}

	@Override
	public String deposit(int accno, float amt) {
		// TODO Auto-generated method stub
		String depositeMsg=null;
		if(amt>200000)
			amt=amt-(amt*0.3f);
		depositeMsg=target.deposit(accno, amt);
		return depositeMsg;
		
	}

	@Override
	public String tranferMoney(int srcAncc, int desAncc, float amt) {
		// TODO Auto-generated method stub
		String transferMoneyMsg=null;
		if(amt>=200000)
			amt=amt-(amt*0.3f);
			//use target class
			transferMoneyMsg=target.tranferMoney(srcAncc, desAncc, amt);
		return transferMoneyMsg;
	}

}
