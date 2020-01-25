package com.mhb.fpm;

public class PulsarBike implements Bike {
private String pickup;
	@Override
	public void driver() {
		System.out.println("Driving Pulsar with pickup" +pickup);

	}
	public PulsarBike(String pickup) {
		
		this.pickup = pickup;
	}

}
