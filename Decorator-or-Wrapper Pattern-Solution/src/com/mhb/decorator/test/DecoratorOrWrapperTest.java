package com.mhb.decorator.test;

import com.mhb.component.IceCream;
import com.mhb.concrete.component.ButterScotchIceCream;
import com.mhb.concrete.component.ChochobarIceCream;
import com.mhb.concrete.component.VanilaIceCream;
import com.mhb.concrete.decorator.IceCreamDecorator;
import com.mhb.decorator.ChocolateIceCreamDecorator;
import com.mhb.decorator.DryfruitsIceCream;
import com.mhb.decorator.HoneyIceCreamDecorator;

public class DecoratorOrWrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IceCream ice1 ,ic2,ic3=null;
IceCreamDecorator dc1=null,dc2=null,dc3=null;
//prepare basic vanila Icecream
ice1=new ChochobarIceCream();
dc1=new DryfruitsIceCream(new HoneyIceCreamDecorator(new ChocolateIceCreamDecorator(ice1)));
dc1.prepare();
System.out.println("---------------------");
ic2=new ButterScotchIceCream();
dc2=new ChocolateIceCreamDecorator(ic2) ;
dc2.prepare();
System.out.println("------------------------------------------------------");
ic3=new VanilaIceCream();
dc3=new HoneyIceCreamDecorator(ic3);
dc3.prepare();
	}
}
