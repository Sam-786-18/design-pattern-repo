package com.mhb.adaptor.service;

import com.mhb.adaptor.PaymentAdaptor;
import com.mhb.adaptor.dto.CustomerPaymentDetailsDTO;

public class OnlineShoppingPayment {
public String payPayment(CustomerPaymentDetailsDTO cpdDTO)
{
	String paymentMsg=null;
	PaymentAdaptor adaptor=null;
	//use  Adaptor
	adaptor=new PaymentAdaptor();
	paymentMsg=adaptor.doPaymentUsingPayPalComp(cpdDTO);
	 return paymentMsg;
}
}
