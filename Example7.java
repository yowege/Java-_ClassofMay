package com.calssofmay;

public class Example7 {

	public int age = 20;// Instance variable
	public static double salary = 2000;// Static Variable
	public static String dept = "Finance";// Static Variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example7 ex = new Example7();// Object creation is based on class name

		Example7.salary = 5000;// Static variable defined in a method

		System.out.println(Example7.salary);// to call static variable we don't need to create object
		System.out.println(Example7.dept);// Calling Static variable don't need Object

		System.out.println(ex.age);// Instance variable is called through object
		// System.out.println(ex.age=41);//Changing the defined value of instance
		// variable in main

	}

}
