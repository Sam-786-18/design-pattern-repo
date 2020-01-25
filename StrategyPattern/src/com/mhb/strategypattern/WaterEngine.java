package com.mhb.strategypattern;

public final class WaterEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Water engine started");

	}

	@Override
	public void stop() {
		System.out.println("Walter Engine Stoped");

	}

}
