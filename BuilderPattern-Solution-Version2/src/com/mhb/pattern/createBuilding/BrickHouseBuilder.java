package com.mhb.pattern.createBuilding;

import com.mhb.pattern.brick.CementAndFalseCielingRoof;
import com.mhb.pattern.brick.CementAndIronStructure;
import com.mhb.pattern.brick.CementAndSandBasement;
import com.mhb.pattern.builder.HouseBuilder;
import com.mhb.pattern.product.House;
import com.mhb.pattern.wooden.WoodenInterior;

public class BrickHouseBuilder implements HouseBuilder {
private House house;
	public BrickHouseBuilder() {
	this.house =  new House();
}

	@Override
	public boolean buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement(new CementAndSandBasement());
		return true;
	}

	@Override
	public boolean buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure(new CementAndIronStructure());
		return true;
	}

	@Override
	public boolean buildRoof() {
		house.setRoof(new CementAndFalseCielingRoof());
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
