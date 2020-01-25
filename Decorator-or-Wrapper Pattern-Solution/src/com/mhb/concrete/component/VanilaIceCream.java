package com.mhb.concrete.component;

import com.mhb.component.IceCream;

public class VanilaIceCream implements IceCream {

	@Override
	public void prepare() {
		System.out.println("preparing Vanila ice cream");

	}

}
