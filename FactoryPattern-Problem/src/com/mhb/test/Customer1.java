package com.mhb.test;

import com.mhb.factory.Car;
import com.mhb.factory.Engine;

public class Customer1 {
	
public static void main(String[] args) {
	Engine engine=null;
	Car car=null;
	engine =new Engine("1200c");
	car=new Car(engine);
	car.diver();
}
}
