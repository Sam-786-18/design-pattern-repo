package com.mhb.decorator;

import com.mhb.component.IceCream;
import com.mhb.concrete.decorator.IceCreamDecorator;

public class DryfruitsIceCream  extends IceCreamDecorator{

	public DryfruitsIceCream(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}

@Override
public void prepare() {
	// TODO Auto-generated method stub
	super.prepare();
	
}
@Override
public void addToppings() {
	System.out.println("adding dryFruits");
	
}
}
