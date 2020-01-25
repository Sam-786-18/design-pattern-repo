package com.proxy.service;

public interface BankService {
	
	public String withdraw(int accno,float amt);
	public String deposit(int accno,float amt);
	public String tranferMoney(int srcAncc, int desAncc, float amt);

}
