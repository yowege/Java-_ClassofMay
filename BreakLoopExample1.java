package com.calssofmay;

public class BreakLoopExample1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 0; i <= 20; i++) {

			sum = sum + i;
			if (sum > 10) {
				break; // terminate loop if sum is greater than 10

			}

			System.out.println(sum);

		} // end for statement

	}

}
