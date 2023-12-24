package com.springcore.constructorInjection_4;

public class Student {
	
	private int studId;
	private String studName;
	private String studCity;
	
	
	public Student() {
		super();
	}

	public Student(int studId, String studName, String studCity) {
		System.out.println("Int String String");
		this.studId = studId;
		this.studName = studName;
		this.studCity = studCity;
	}
	
	public Student(String studId, String studName, String studCity) {
		System.out.println("String String String");
		this.studId = Integer.parseInt(studId);
		this.studName = studName;
		this.studCity = studCity;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studCity=" + studCity + "]";
	}
	
}
