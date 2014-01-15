package com.emt.resources;

import java.util.Date;



public class Expenditure{
	
	
	
	private int expId;
	private String expItemName;
	private String expPrice;
	private Date expDate;
	

	public int getExpId() {
		return expId;
	}
	public void setExpId(int expId) {
		this.expId = expId;
	}
	public String getExpItemName() {
		return expItemName;
	}
	public void setExpItemName(String expItemName) {
		this.expItemName = expItemName;
	}
	public String getExpPrice() {
		return expPrice;
	}
	public void setExpPrice(String expPrice) {
		this.expPrice = expPrice;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}	

}
