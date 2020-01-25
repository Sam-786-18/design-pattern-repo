package com.mhb.strategypattern.test;

import com.mhb.strategypattern.DieselEngine;
import com.mhb.strategypattern.ElectricEngine;
import com.mhb.strategypattern.Engine;
import com.mhb.strategypattern.PetrolEngine;
import com.mhb.strategypattern.WaterEngine;

public class ViechleFactory {
public static Viechle getInstance(String viechleType){
	Viechle viechle=null;
	Engine engine=null;
	viechle=new Viechle();
	if(viechleType.equalsIgnoreCase("petrol"))
	{
		engine=new PetrolEngine();
		viechle.setEngine(engine);
	}
	else if(viechleType.equalsIgnoreCase("diesel"))
	{
		engine=new DieselEngine();
		viechle.setEngine(engine);
		
	}
	else if(viechleType.equalsIgnoreCase("water"))
	{
		engine=new WaterEngine();
		viechle.setEngine(engine);
	}
	else if(viechleType.equalsIgnoreCase("elcetric"))
	{
		engine=new ElectricEngine();
		viechle.setEngine(engine);
	}
	else{
		throw new IllegalArgumentException("invalid Engine type");
	}	
	return viechle;
}
}
