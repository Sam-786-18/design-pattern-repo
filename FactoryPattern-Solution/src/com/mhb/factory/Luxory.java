package com.mhb.factory;

public class Luxory extends Car {
private String entertaiment;
	public Luxory(Engine engine, String entertaiment) {
		super(engine);
		// TODO Auto-generated constructor stub
		this.entertaiment=entertaiment;
	}

	
@Override
	public void diver() {
		// TODO Auto-generated method stub
		super.diver();
		System.out.println("with "+entertaiment);
	}
}
