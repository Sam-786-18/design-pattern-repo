package com.mhb.decorator.pattern;

public class DryFruitsChochobarIceCream extends ChochoBarIceCream {
@Override
public void prepare() {
	// TODO Auto-generated method stub
	super.prepare();
	addDryFruits();
}
private void addDryFruits(){
	System.out.println("adding DryFruits to Chochobar");
}
}
