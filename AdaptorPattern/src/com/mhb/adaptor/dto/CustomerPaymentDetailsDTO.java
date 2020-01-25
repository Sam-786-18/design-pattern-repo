package com.mhb.adaptor.dto;

import java.io.Serializable;

public class CustomerPaymentDetailsDTO implements Serializable {
private long cardNo;
private String paymentgateway;
private String bankName;
private float amount;
public long getCardNo() {
	return cardNo;
}
public void setCardNo(long cardNo) {
	this.cardNo = cardNo;
}
public String getPaymentgateway() {
	return paymentgateway;
}
public void setPaymentgateway(String paymentgateway) {
	this.paymentgateway = paymentgateway;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}

}
