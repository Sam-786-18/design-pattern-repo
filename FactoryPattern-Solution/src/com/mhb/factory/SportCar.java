package com.mhb.factory;

public class SportCar extends Car {
private String pickup;
	public SportCar(Engine engine ,String pickup) {
		super(engine);
		this.pickup=pickup;
		// TODO Auto-generated constructor stub
	}
@Override
	public void diver() {
		// TODO Auto-generated method stub
		super.diver();
		System.out.println("With Extra"+pickup);
	}
}
