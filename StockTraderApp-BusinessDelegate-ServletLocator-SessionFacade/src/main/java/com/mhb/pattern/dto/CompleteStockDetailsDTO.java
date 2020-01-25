package com.mhb.pattern.dto;

public class CompleteStockDetailsDTO {
private String stockName;
private String country;
private int stockId;
private int stockPrice;
private int stockFuturePrice;
private String excangeName;
public String getStockName() {
	return stockName;
}
public void setStockName(String stockName) {
	this.stockName = stockName;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getStockId() {
	return stockId;
}
public void setStockId(int stockId) {
	this.stockId = stockId;
}
public int getStockPrice() {
	return stockPrice;
}
public void setStockPrice(int stockPrice) {
	this.stockPrice = stockPrice;
}
public int getStockFuturePrice() {
	return stockFuturePrice;
}
public void setStockFuturePrice(int stockFuturePrice) {
	this.stockFuturePrice = stockFuturePrice;
}
public String getExcangeName() {
	return excangeName;
}
public void setExcangeName(String excangeName) {
	this.excangeName = excangeName;
}


}
