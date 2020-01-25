package com.mhb.decorator.pattern;

public class DryFruitVanilaIceCream extends VanilaIceCream {
@Override
public void prepare() {
	// TODO Auto-generated method stub
	super.prepare();
	addDryFruits();
}
private void addDryFruits(){
	System.out.println("adding DryFruits Vanila Ice cream");
}
}
