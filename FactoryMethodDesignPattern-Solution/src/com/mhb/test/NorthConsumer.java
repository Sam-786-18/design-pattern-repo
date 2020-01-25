package com.mhb.test;

import com.mhb.fpm.BajajNagpurFactory;
import com.mhb.fpm.Bike;

public class NorthConsumer {
public static void main(String[] args) {
	Bike bike=null;
	bike =BajajNagpurFactory.createBike("pulsor");
	bike.driver();
}
}
