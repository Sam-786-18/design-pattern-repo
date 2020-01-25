package om.mhb.sigleton;

import om.mhb.util.CommonUtil;

public class PrinterUtil extends CommonUtil {
	private static volatile PrinterUtil instance;
	private static boolean isInstantiated=false;
    private PrinterUtil(){
	if(isInstantiated)
	
		throw new IllegalArgumentException("Second obj is created for Singleton---");
	
	else
		isInstantiated=true;
	
}
public static final PrinterUtil getInstance(){
	if(instance==null) {//1st null check
		synchronized (PrinterUtil.class) {
			instance=new PrinterUtil();
		}//if
	//synchronized
}//if
	return instance;
}//method


//protection form Deserialization
public Object readResolve(){
	return instance;
}
}
