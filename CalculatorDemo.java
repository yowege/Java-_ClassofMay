package com.calssofmay;

public class CalculatorDemo {

	public static int add(int a, int b) {

		return a + b;
	}

	public static int sub(int a, int b) {

		return a - b;
	}

	public static int mult(int a, int b) {

		return a * b;
	}

	public static double div(int a, int b) {

		return a / b;
	}

	public static int modul(int a, int b) {

		return a % b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The sum of two numbes is :" + CalculatorDemo.add(20, 10));

		System.out.println("The subtraction of two numbes is :" + CalculatorDemo.sub(20, 10));

		System.out.println("The multiplication of two numbes is :" + CalculatorDemo.mult(20, 10));

		System.out.println("The division of two numbes is :" + CalculatorDemo.div(20, 10));

		System.out.println("The module of two numbes is :" + CalculatorDemo.modul(21, 10));
	}

}
