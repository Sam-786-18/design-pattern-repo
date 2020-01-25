package com.mhb.pattern.product;

import com.mhb.pattern.BuildingStructure.Basement;
import com.mhb.pattern.BuildingStructure.Interior;
import com.mhb.pattern.BuildingStructure.Roof;
import com.mhb.pattern.BuildingStructure.Structure;

public class House {
private Basement basement;
private Structure structure;
private Roof roof;
private Interior interior;
public Basement getBasement() {
	return basement;
}
public void setBasement(Basement basement) {
	this.basement = basement;
}
public Structure getStructure() {
	return structure;
}
public void setStructure(Structure structure) {
	this.structure = structure;
}
public Roof getRoof() {
	return roof;
}
public void setRoof(Roof roof) {
	this.roof = roof;
}
public Interior getInterior() {
	return interior;
}
public void setInterior(Interior interior) {
	this.interior = interior;
}
@Override
public String toString() {
	return "House [basement=" + basement + ", structure=" + structure + ", roof=" + roof + ", interior=" + interior
			+ "]";
}


}
