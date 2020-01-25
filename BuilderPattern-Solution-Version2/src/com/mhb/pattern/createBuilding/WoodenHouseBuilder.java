package com.mhb.pattern.createBuilding;

import com.mhb.pattern.Igloo.DoubleLayerIceRoof;
import com.mhb.pattern.brick.CementAndSandBasement;
import com.mhb.pattern.builder.HouseBuilder;
import com.mhb.pattern.product.House;
import com.mhb.pattern.wooden.WoodenInterior;
import com.mhb.pattern.wooden.Wooden_Iron_Structure;

public class WoodenHouseBuilder implements HouseBuilder {
private House house;
	public WoodenHouseBuilder() {
	this.house =new House();
}

	@Override
	public boolean buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement(new CementAndSandBasement() );
		return true;
	}

	@Override
	public boolean buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure(new Wooden_Iron_Structure());
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
		house.setInterior(new WoodenInterior());
		return true;
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
