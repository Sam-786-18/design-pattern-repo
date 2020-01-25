package com.mhb.adaptor.dto;

public class PayPalComponet {
private static PayPalComponet instance;
private PayPalComponet() {
	//no operation
}
 public static PayPalComponet getInstance(){
 if(instance==null){
	 synchronized (PayPalComponet.class) {
		if(instance==null)
			instance=new PayPalComponet();
	}
 }
 return instance;
 }
 public String doPayment(PaymentDetails dto){
	 return dto.getCardNo()+"  card getting payment of  "+dto.getAmount()+  "  from bank code   "+dto.getBankCode();
 }
}
