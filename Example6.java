package com.calssofmay;

public class Example6 {

	public void methodOne() {

		int i = 25; // local variable for methodOne
		System.out.println("the value of i: " + i);
	}

	public void methodTwo() {

		int j = 20;// local variable for methodTwo
//	System.out.println("The value of i is :"+i); //ERROR
		System.out.println("The value of j is :" + j);
	}

	public void methodThree() {

		int j = 10;// local variable for methodThree
		// System.out.println("The value of i is :"+i); //ERROR
		System.out.println("The value of j is :" + j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example6 mc = new Example6();/*
										  THIS IS HOW OBJECT IS CREATED USING (class MyClass)from main into main method
										 */

		mc.methodOne();// this is to call the output of methodOne class
		mc.methodTwo();
		mc.methodThree();

	}
}
