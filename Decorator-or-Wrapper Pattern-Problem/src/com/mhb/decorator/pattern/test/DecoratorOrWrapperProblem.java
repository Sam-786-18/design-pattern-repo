package com.mhb.decorator.pattern.test;

import com.mhb.decorator.pattern.ButterScotchIceCream;
import com.mhb.decorator.pattern.DryFruitButterScotchIceCream;
import com.mhb.decorator.pattern.IceCream;
import com.mhb.decorator.pattern.VanilaIceCream;

public class DecoratorOrWrapperProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCream icecream1, icecream2,icecream3=null;
		icecream1=new ButterScotchIceCream();
		icecream1.prepare();
		System.out.println("--------------------------");
		icecream2=new VanilaIceCream();
		icecream2.prepare();
		System.out.println("------------------------------");
		icecream3=new DryFruitButterScotchIceCream();
		icecream3.prepare();

	}
	

}
