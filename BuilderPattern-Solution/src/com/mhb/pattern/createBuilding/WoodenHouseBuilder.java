package com.mhb.pattern.createBuilding;

import com.mhb.pattern.builder.HouseBuilder;
import com.mhb.pattern.product.House;

public class WoodenHouseBuilder implements HouseBuilder {
private House house;
	public WoodenHouseBuilder() {
	this.house =new House();
}

	@Override
	public boolean buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("Wooden:Stones and Sand");
		return true;
	}

	@Override
	public boolean buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure("WoodenHouse:Cement/Iron Pillars");
		return true;
	}

	@Override
	public boolean buildRoof() {
		house.setRoof("WoodenHouse:wooden Roof");
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("WoodenHouse: wooden interior");
		return true;
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
