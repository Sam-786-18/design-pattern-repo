package om.mhb.test;

import om.mhb.sigleton.PrinterUtil;

public class CloningSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrinterUtil util=null;
		PrinterUtil util1=null;
		try{
			util=PrinterUtil.getInstance();
			util1=(PrinterUtil) util.clone();
			System.out.println("uitl obj hashcode::" +util.hashCode());
			System.out.println("uitl1 obj hashcode::" +util1.hashCode());
		}
		catch(CloneNotSupportedException cnse)
		{
			cnse.printStackTrace();
		}
		catch(Exception es){
			es.printStackTrace();
		}
		

	}

}
