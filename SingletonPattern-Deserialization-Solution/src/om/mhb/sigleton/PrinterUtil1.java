package om.mhb.sigleton;

public class PrinterUtil1 {
//same class type memeber variable n the class itself
	private volatile static PrinterUtil1 instance;
	private static boolean isInstantiated =false;
	
	//private static PrinterUtil instance=new PrinterUtil();//eager instantiation
	//private static PribterUtil instance;
	/*static{
		instance=new PrinterUtil1();
	}*/
	//private constructor to constructor based instantiation for outside class
private PrinterUtil1(){
	System.out.println("PrinterUtil:0-param constructor");
	if(isInstantiated==true)
	{
	throw new IllegalArgumentException("we can not create multiple objs for singletone class ");
	}
	else
		isInstantiated=true;
	}	
	@Override
		public Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			throw new CloneNotSupportedException();
		}
	/*public static PrinterUtil getInstance(){
		return instance;
	}*/
	//static factory method having singleton logic
/*	public synchronized static PrinterUtil getInstance(){//lazy instantiation
		if(instance==null)
		{
			instance=new PrinterUtil();
		}
		return instance;
	}*/
	
	public synchronized static PrinterUtil1 getInstance(){//lazy instantiation double check
		if(instance==null)//1st level check
			{
			synchronized (PrinterUtil1.class) {
				if(instance==null)//2nd level check
				{
					instance=new PrinterUtil1();
				}//if
			}//synchronized
	}//if
	return instance;	
}
public Object readResolve()	
{
	System.out.println("readResolve()");
return instance;	
}
}
