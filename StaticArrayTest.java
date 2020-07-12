package com.calssofmay;

public class StaticArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] studentMarks = { 67.234,78.45,80,95,55,77,23,45 };
		calcTotal(studentMarks);

	}

	public static void calcTotal(double[] marks) {

		double total = 0;

		for (int i = 0; i < marks.length; i++) {

			total = total + marks[i];
		}
		System.out.println("Total is " + total);
	}

}
