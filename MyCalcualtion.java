package com.calssofmay;

class CalculationOne {

	int z;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the  given numbers:" + z);
	}

	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers:" + z);
	}

}

// INheRITANS

class CalculationTwo extends CalculationOne {

	public void division(int x, int y) {

		z = x / y;

		System.out.println("Divsion of two numbers " + z);
	}
}

public class MyCalcualtion extends CalculationTwo {

	public void multiplication(int x, int y) {

		z = x * y;

		System.out.println("Multiplication of two numbers " + z);
	}

	public static void main(String[] args) {

		int a = 20, b = 10;
		MyCalcualtion demo = new MyCalcualtion();

		demo.addition(a, b);
		demo.Subtraction(a, b);
		demo.division(a, b);
		demo.multiplication(a, b);

	}
}
