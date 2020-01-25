package com.mhb.test;

import com.mhb.factory.Car;
import com.mhb.factory.CarDealer;
import com.mhb.factory.Engine;

public class Customer1 {
	
public static void main(String[] args) {
	Car car=null;
	//car =CarDealer.getCar("luxory");
	//car =CarDealer.getCar("sport");
	car =CarDealer.getCar("budget");
	car.diver();
}
}
