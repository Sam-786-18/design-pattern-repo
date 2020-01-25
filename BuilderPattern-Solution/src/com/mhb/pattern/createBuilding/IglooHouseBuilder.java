package com.mhb.pattern.createBuilding;

import com.mhb.pattern.builder.HouseBuilder;
import com.mhb.pattern.product.House;

public class IglooHouseBuilder implements HouseBuilder {
private House house;
	public IglooHouseBuilder() {
	this.house = new House();
}

	@Override
	public boolean buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("IglooHouse:IceBlock");
		return true;
	}

	@Override
	public boolean buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure("IglooHouse:Plastic Dom");
		return true;
	}

	@Override
	public boolean buildRoof() {
		house.setRoof("IglooHouse:Ice Mixture");
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("IglooHouse:Double Layer Ice cieling");
		return true;
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
