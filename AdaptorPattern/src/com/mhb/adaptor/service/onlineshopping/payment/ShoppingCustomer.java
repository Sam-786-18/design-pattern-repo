package com.mhb.adaptor.service.onlineshopping.payment;

import com.mhb.adaptor.dto.CustomerPaymentDetailsDTO;
import com.mhb.adaptor.service.OnlineShoppingPayment;

public class ShoppingCustomer {
public static void main(String[] args) {
	OnlineShoppingPayment shopping=null;
	CustomerPaymentDetailsDTO cpdDTO=null;
	String reciept;
	shopping=new OnlineShoppingPayment();
	//prepare CustomerPaymentDetailsDTO
	cpdDTO=new CustomerPaymentDetailsDTO();
	cpdDTO.setCardNo(112334355);
	cpdDTO.setBankName("ICICI");
	cpdDTO.setPaymentgateway("VISA");
	cpdDTO.setAmount(9000);
	//do payment
	reciept=shopping.payPayment(cpdDTO);
	System.out.println("Reciept   "  +reciept);
	
}
}
