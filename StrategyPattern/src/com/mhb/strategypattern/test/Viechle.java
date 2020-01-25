package com.mhb.strategypattern.test;

import com.mhb.strategypattern.Engine;

public class Viechle {
private Engine engine;

public Engine getEngine() {
	return engine;
}

public void setEngine(Engine engine) {
	this.engine = engine;
}
public void  move(){
	engine.start();
	System.out.println("Viechle is moving");
}
public void park(){
	engine.stop();
	System.out.println("Viechle is stoping");
}
}
