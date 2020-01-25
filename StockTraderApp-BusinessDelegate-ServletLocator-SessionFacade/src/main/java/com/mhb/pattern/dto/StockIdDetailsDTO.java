package com.mhb.pattern.dto;

import java.io.Serializable;

public class StockIdDetailsDTO implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int stockId;
private String stockName;
private String country;
private String exchange;
public int getStockId() {
	return stockId;
}
public void setStockId(int stockId) {
	this.stockId = stockId;
}
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
public String getExchange() {
	return exchange;
}
public void setExchange(String exchange) {
	this.exchange = exchange;
}

}
