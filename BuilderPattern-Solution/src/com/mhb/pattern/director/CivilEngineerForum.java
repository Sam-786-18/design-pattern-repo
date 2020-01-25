package com.mhb.pattern.director;

import com.mhb.pattern.builder.HouseBuilder;
import com.mhb.pattern.createBuilding.BrickHouseBuilder;
import com.mhb.pattern.createBuilding.IglooHouseBuilder;
import com.mhb.pattern.createBuilding.WoodenHouseBuilder;

public class CivilEngineerForum {

	public static CivilEngineer getInstance(String houseType)
	{
		CivilEngineer engineer=null;
		HouseBuilder builder=null;
		if(houseType.equalsIgnoreCase("brick"))
		{
			System.out.println("Brick");
			builder=new BrickHouseBuilder();
			engineer=new CivilEngineer(builder);
		}
		else if(houseType.equalsIgnoreCase("igloo"))
		{
			builder=new IglooHouseBuilder();
			engineer=new CivilEngineer(builder);
		}
		else if(houseType.equalsIgnoreCase("wooden"))
		{
			builder=new WoodenHouseBuilder();
			engineer=new CivilEngineer(builder);
		}
		else{
			throw new IllegalArgumentException("invalid house type");
		}
		return engineer;
	}
}
