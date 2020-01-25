package com.mhb.factory;

public class Car {
private Engine engine;

public Car(Engine engine) {

	this.engine = engine;
}

public void diver(){
	System.out.println("Drving First Car with "+engine);
}
}
