package com.mhb.strategypattern.test;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Viechle viechle=null;
viechle=ViechleFactory.getInstance("elcetric");


viechle.move();
viechle.park();
	}

}
