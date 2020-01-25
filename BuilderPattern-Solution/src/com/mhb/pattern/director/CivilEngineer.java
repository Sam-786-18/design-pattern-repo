package com.mhb.pattern.director;

import com.mhb.pattern.builder.HouseBuilder;
import com.mhb.pattern.product.House;

public class CivilEngineer {
   HouseBuilder builder;

public CivilEngineer(HouseBuilder builder) {
	this.builder = builder;
}
public House constuctHouse(){
	House house=null;
	//build house
	if(builder.buildBasement())
		if(builder.buildStructure())
			if(builder.buildRoof())
				if(builder.buildInterior()){
					//get Product (house) from builder
					house=builder.getHouse();
				
	                   return house;

}
	
return null;

}
}


