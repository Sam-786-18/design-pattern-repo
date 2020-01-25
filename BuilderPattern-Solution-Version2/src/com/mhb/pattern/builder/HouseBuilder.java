package com.mhb.pattern.builder;

import com.mhb.pattern.product.House;

public interface HouseBuilder {
public boolean buildBasement();
public boolean buildStructure();
public boolean buildRoof();
public boolean buildInterior();
public House getHouse();
}
