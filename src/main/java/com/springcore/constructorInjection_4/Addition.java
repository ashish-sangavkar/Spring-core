package com.springcore.constructorInjection_4;

public class Addition {

	private int a;
	private int b;
	
	public Addition(double a, double b) {
		System.out.println("double double");
		this.a = (int)a;
		this.b = (int)b;
	}
	
	public Addition(int a, int b) {
		System.out.println("Int Int");
		System.out.println("a="+a);
		System.out.println("b="+b);
		this.a = a;
		this.b = b;
	}
	
	
//	public Addition(String a, String b) {
//		System.out.println("String String");
//		this.a = Integer.parseInt(a);
//		this.b = Integer.parseInt(b);
//	}
	
	public void add() {
		System.out.println(""+(a+b));
	}
	
}
