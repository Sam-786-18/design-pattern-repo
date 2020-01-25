package com.mhb.fpm;

public class BajajNagpurFactory {

	public static void paint() {
		System.out.println("bike painting");
	}

	public static void oiling() {
		System.out.println("bike intial oiling");
	}

	public static void assemble() {
		System.out.println("Bike assembleing");
	}

	public static Bike createBike(String type) {
		Bike bike = null;
		if (type.equalsIgnoreCase("pulsor")) {
			bike = new PulsarBike("0-100kmph  in 10sec");
			System.out.println("Creating Pulsor Bike");
		} else if (type.equalsIgnoreCase("DiscoverBike")) {
			bike = new DiscoverBike("99 kmpL");
			System.out.println("Creating DiscoverBike");
		} else {
			throw new IllegalArgumentException("we don not suplly this model");
		}
		paint();
		oiling();
		assemble();
		return bike;
	}

}
