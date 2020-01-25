package com.mhb.pattern.createBuilding;

import com.mhb.pattern.builder.HouseBuilder;
import com.mhb.pattern.product.House;

public class BrickHouseBuilder implements HouseBuilder {
private House house;
	public BrickHouseBuilder() {
	this.house =  new House();
}

	@Override
	public boolean buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("BrickHouse:Stones and Sand");
		return true;
	}

	@Override
	public boolean buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure("BrickHouse:Cement+Iron Pillars");
		return true;
	}

	@Override
	public boolean buildRoof() {
		house.setRoof("BrickHouse:Cement Roof");
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("BrickHouse: fall cieling");
		return true;
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
