package com.mhb.factory;

public class CarDealer {
	static public Car getCar(String type){
Engine engg=null;
Car car =null;
if(type.equalsIgnoreCase("budget")){
	engg=new Engine("120c");
	car=new Car(engg);
	return car;
    }
else if(type.equalsIgnoreCase("Sport")){
	engg=new Engine("320c");
	car=new Car(engg);
	return car;
}
else if(type.equalsIgnoreCase("luxory"))
{
	engg=new Engine("240c");
	car=new Car(engg);
	return car;
	
}
else{
	throw new IllegalArgumentException("");
}

	}
		

	
}
