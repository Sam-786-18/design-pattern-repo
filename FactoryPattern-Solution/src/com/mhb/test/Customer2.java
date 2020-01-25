package com.mhb.test;

import com.mhb.factory.Car;
import com.mhb.factory.Engine;
import com.mhb.factory.Luxory;

public class Customer2 {
public static void main(String[] args) {
	Engine engine=null;
	Car car=null;
	engine=new Engine("240c");
	car=new Luxory(engine,"Beat Box Speaker");
	car.diver();
	
}
}
