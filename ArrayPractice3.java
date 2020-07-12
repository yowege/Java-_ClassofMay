package com.calssofmay;

public class ArrayPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] studentMarks = { 67, 78, 80, 95, 55, 77 };
		int[] StudRate = { 40, 60, 50, 35 };
		double average = 0;
//		double sum = 0;
		calcTotal(StudRate);

	}

	public static void calcTotal(int[] marks) {
		double sum = 0;
		double average = 0;
		for (int i = 0; i < marks.length; i++) {

			sum = sum + marks[i];
			average = sum / marks.length;

		}
		System.out.println(+sum);

		System.out.println("Averge is :  " + average);
	}

}
