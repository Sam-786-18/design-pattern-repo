package com.mhb.pattern.test;

import com.mhb.pattern.director.CivilEngineer;
import com.mhb.pattern.director.CivilEngineerForum;
import com.mhb.pattern.product.House;

public class USConsumer {
public static void main(String[] args) {
CivilEngineer engineer =null;
House house=null;
engineer=CivilEngineerForum.getInstance("wooden");
house=engineer.constuctHouse();
System.out.println("House Generated By "+house);
}
}
