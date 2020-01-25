package om.mhb.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import om.mhb.sigleton.PrinterUtil;


public class DeserilizationSingleton {
public static void main(String[] args) {
PrinterUtil util =null,util1=null;
ObjectOutputStream oos=null;
ObjectInputStream ooi=null;
util=PrinterUtil.getInstance();
try{
	//perform serialization 
	oos=new ObjectOutputStream(new FileOutputStream("Periter.ser"));
	oos.writeObject(util);
	oos.flush();
	oos.close();
	System.out.println("Serialization is completed");
}
catch(Exception ex){
	ex.printStackTrace();
}
	//perform Deserialization
try{
	ooi=new ObjectInputStream(new FileInputStream("Periter.ser"));
	util1=(PrinterUtil) ooi.readObject();
	ooi.close();
	System.out.println("Deserialization Is Completed");
	System.out.println("util hashcode: "+util.hashCode());
	System.out.println("Util1 hashcode: "+util1.hashCode());
}
catch(Exception ex)
{
ex.printStackTrace();	
}
}
}
