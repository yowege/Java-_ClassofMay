package com.calssofmay;

public class StudentMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] StudentMark = { 67, 78, 80, 95, 55, 77 };

		double avg;
		double sum = 0;

//		for(double i:StudentMark) {
//			
//			sum = sum+i;
//			
//		}

	//	============  Another way of using for loop ========= //
		
		for (int i = 0; i < StudentMark.length; i++) {
			
			sum = sum + StudentMark[i];

		}
		avg = sum / StudentMark.length;

		System.out.println(avg);
	}

}
