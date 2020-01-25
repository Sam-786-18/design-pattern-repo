package om.mhb.test;

import java.lang.reflect.Constructor;

import om.mhb.sigleton.PrinterUtil;
import om.mhb.sigleton.PrinterUtil1;


public class ReflectionSingleton {
public static void main(String[] args) {
PrinterUtil1 util=null,util1=null;
Class clazz=null;
Constructor cons[]=null;
//get Singleton class object
util=PrinterUtil1.getInstance();
try{
	//create obj for PrinterUtil by Accessing private Constructor of that class
	//load class
	clazz=Class.forName("om.mhb.sigleton.PrinterUtil");
	//get All constructor of the class
	cons=clazz.getDeclaredConstructors();
	//provide access to private constructor
	cons[0].setAccessible(true);
	//creating obj using the accessed constructor
	util1=(PrinterUtil1) cons[0].newInstance(null);
	System.out.println("util hashcode::: "+util.hashCode());
	System.out.println("util1 hashcode::: "+util1.hashCode());
}
catch(Exception ex){
	ex.printStackTrace();
}
	
}
}
