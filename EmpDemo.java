package com.calssofmay;


public class EmpDemo {
	
	
	//Static Variable for salary and name of the employee
	
	public static double salary=3000;
	public static String name = "James";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpDemo.salary = 2000;
		System.out.println("The name of employee: " + EmpDemo.name);
		System.out.println("The salary of the employee: " + EmpDemo.salary);

	}

}
