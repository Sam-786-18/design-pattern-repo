package com.mhb.concrete.decorator;

import com.mhb.component.IceCream;

public abstract class IceCreamDecorator implements IceCream {
private IceCream iceCream;

public IceCreamDecorator(IceCream iceCream) {
	this.iceCream = iceCream;
}

@Override
public void prepare() {
iceCream.prepare();
addToppings();
	}

public abstract void addToppings();
}
