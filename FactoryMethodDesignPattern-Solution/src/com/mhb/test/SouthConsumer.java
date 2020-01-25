package com.mhb.test;

import com.mhb.fpm.BajajChennaiFactory;
import com.mhb.fpm.Bike;

public class SouthConsumer {
public static void main(String[] args) {
	Bike bike=null;
	bike=BajajChennaiFactory.createBike("DiscoverBike");
	bike.driver();
}
}
