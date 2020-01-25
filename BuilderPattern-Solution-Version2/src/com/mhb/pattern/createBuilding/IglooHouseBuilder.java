package com.mhb.pattern.createBuilding;

import com.mhb.pattern.Igloo.DoubleLayerIceRoof;
import com.mhb.pattern.Igloo.IceBlocksBasement;
import com.mhb.pattern.Igloo.IceCarvingInterior;
import com.mhb.pattern.Igloo.PlasticDromStructure;
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
		house.setBasement(new IceBlocksBasement());
		return true;
	}

	@Override
	public boolean buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure(new PlasticDromStructure());
		return true;
	}

	@Override
	public boolean buildRoof() {
		house.setRoof(new DoubleLayerIceRoof());
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior(new IceCarvingInterior());
		return true;
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
