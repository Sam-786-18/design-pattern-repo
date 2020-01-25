package om.mhb.test;

import om.mhb.sigleton.PrinterUtil;

class TicketPrinterServlet1 implements Runnable{

	@Override
	public void run() {
		PrinterUtil util=null;
		//give PrinterUtil class obj
		util=PrinterUtil.getInstance();
		System.out.println("Current thread name:: "+Thread.currentThread().getName());
		System.out.println("PrintUtil class object hashcode "+util.hashCode());
	}
}
public class MultiThreadingSingleton {
public static void main(String[] args) {
	TicketPrinterServlet1 servlet=null;
	Thread req1=null,req2=null;
	//create TicketPrinterServlet 
	servlet=new TicketPrinterServlet1();
	//start threads representing requests
	
	req1=new Thread(servlet);
	req2=new Thread(servlet);
	req1.start();
	req2.start();
	
}
}
