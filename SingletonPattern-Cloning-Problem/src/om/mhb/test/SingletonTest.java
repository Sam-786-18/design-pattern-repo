package om.mhb.test;

import om.mhb.sigleton.PrinterUtil;

public class SingletonTest {
public static void main(String[] args) {
	PrinterUtil util1=null,util2=null;
	//get PrinterUtil class obj
	util1=PrinterUtil.getInstance();
	util2=PrinterUtil.getInstance();
	//display hashcode
	System.out.println("util1:: hashcode: "+util1);
	System.out.println("util2:: hashcode: "+util2);
	
	System.out.println("util1==util2 "+(util1==util2));
}
}
