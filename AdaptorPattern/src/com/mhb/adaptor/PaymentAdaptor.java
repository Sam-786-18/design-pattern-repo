package com.mhb.adaptor;

import com.mhb.adaptor.dto.CustomerPaymentDetailsDTO;
import com.mhb.adaptor.dto.PayPalComponet;
import com.mhb.adaptor.dto.PaymentDetails;

public class PaymentAdaptor {
public String doPaymentUsingPayPalComp(CustomerPaymentDetailsDTO cpdDTO)
{
	int paymentGaywayCode=0;
	int bankCode=0;
	PaymentDetails dto=null;
	PayPalComponet extComp=null;
	String paymentMsg=null;
	//get PaymentGatway code
	if(cpdDTO.getPaymentgateway().equalsIgnoreCase("VISA"))
		paymentGaywayCode=111;
	else if(cpdDTO.getPaymentgateway().equalsIgnoreCase("MASTER"))
		paymentGaywayCode=222;
	
	else if(cpdDTO.getPaymentgateway().equalsIgnoreCase("CIRRUS"))
		paymentGaywayCode=333;
	else
		throw new IllegalArgumentException("invalid payement gatWay");
	if(cpdDTO.getBankName().equalsIgnoreCase("SBI"))
		bankCode=1000;
	else if(cpdDTO.getBankName().equalsIgnoreCase("PNB"))
		bankCode=2000;
	else if(cpdDTO.getBankName().equalsIgnoreCase("ICICI"))
		bankCode=3000;
	else if(cpdDTO.getBankName().equalsIgnoreCase("HDFC"))
		bankCode=4000;
	
	else
		throw new IllegalArgumentException("invalid bank name");
	//prepared payment  objec
	dto =new PaymentDetails();
	dto.setCardNo(cpdDTO.getCardNo());
	dto.setBankCode(bankCode);
	dto.setPaymentGatewayCode(bankCode);
	dto.setAmount(cpdDTO.getAmount());
	//call external service
	extComp=PayPalComponet.getInstance();
	paymentMsg=extComp.doPayment(dto);
		return paymentMsg;
	
}
}
