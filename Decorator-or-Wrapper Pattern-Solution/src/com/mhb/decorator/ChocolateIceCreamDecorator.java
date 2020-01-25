package com.mhb.decorator;

import com.mhb.component.IceCream;
import com.mhb.concrete.decorator.IceCreamDecorator;

public class ChocolateIceCreamDecorator extends IceCreamDecorator {

	public ChocolateIceCreamDecorator(IceCream iceCream) {
		super(iceCream);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addToppings() {
		System.out.println("adding chocolate");

	}

}
