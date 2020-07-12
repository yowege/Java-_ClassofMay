package com.calssofmay;

public class AdditionClass {
	
	// This is  how we overload
	
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
	public void add(double a, int b,int c) {
		System.out.println(a+b+c);
		
	}
	
	public void add(int a) {
		System.out.println(a+a);
	}
	
	public void add(double a, int b,int c, double d) {
		System.out.println(a+b+c+d);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdditionClass ad= new AdditionClass();
		
		ad.add(12);
		ad.add(5,4);
		
		
		
	}

}
