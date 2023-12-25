package com.springcore.autowiringXml_5;

public class Student {
	
	private int studId;
	private String studName;
	private City studCity;
	
	
	public City getStudCity() {
		return studCity;
	}


	public void setStudCity(City studCity) {
		this.studCity = studCity;
	}


	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}


	public String getStudName() {
		return studName;
	}


	public void setStudName(String studName) {
		this.studName = studName;
	}


		
}
