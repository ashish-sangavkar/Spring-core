package com.springcore.beanscope_8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // to avoid bean in config.xml
@Scope("prototype") // to get different object each time
public class Student {
	
	@Value("2001")
	private int studId;
	@Value("Meghanath")
	private String studName;
	@Value("Pune")
	private String studCity;
	
	public Student() {
		super();
	}

	public Student(int studId, String studName, String studCity) {
		super();
		this.studId = studId;
		this.studName = studName;
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


	public String getStudCity() {
		return studCity;
	}


	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studCity=" + studCity + "]";
	}
	
}
