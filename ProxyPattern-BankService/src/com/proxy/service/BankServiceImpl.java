package com.proxy.service;

public class BankServiceImpl implements BankService {
	public BankServiceImpl() {
		System.out.println("Actual Service class Object");
	}

	@Override
	public String withdraw(int accno, float amt) {
		// TODO Auto-generated method stub
		return "withdrawing the amount  "+amt+"  fromaccount number:: "+accno;
	}

	@Override
	public String deposit(int accno, float amt) {
		
		return "depositing the amount "+amt +"from account:: "+accno;
	}

	@Override
	public String tranferMoney(int srcAncc, int desAncc, float amt) {
		// TODO Auto-generated method stub
		withdraw(srcAncc, amt);
		deposit(desAncc, amt);
		return "Transfering the amount: "+amt+ "form source acno"+srcAncc+"  and dest Acno" +desAncc;
	}

}
