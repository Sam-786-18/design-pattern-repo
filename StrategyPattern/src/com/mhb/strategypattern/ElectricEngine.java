package com.mhb.strategypattern;

public class ElectricEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Elctric Engine started");
		
	}

	@Override
	public void stop() {
	System.out.println("Electric Engine stoped");
		
	}



}
