package com.mhb.strategypattern;

public final class PetrolEngine implements Engine {

	@Override
	public void start() {
	System.out.println("Petrol Enginre started");

	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine stoped");

	}

}
