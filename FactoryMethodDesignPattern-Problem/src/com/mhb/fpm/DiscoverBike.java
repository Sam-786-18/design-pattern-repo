package com.mhb.fpm;

public class DiscoverBike implements Bike {
private String milege;

	@Override
	public void driver() {
		// TODO Auto-generated method stub
		System.out.println("Driving BajaDiscover Bike"+milege);

	}

	public DiscoverBike(String milege) {
	
		this.milege = milege;
	}

}
