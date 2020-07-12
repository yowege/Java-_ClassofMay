package com.calssofmay;

public class TenraryOperators {

	public static void main(String[] args) {

		double number = -5.5;
		String result;

		if (number > 0.0) {
			number = 10;
		} else {
			number = -10;
		}

		/// (number > 0.0) ? 10 : -10;

		result = (number > 0.0) ? "Positive" : "Negative";
		System.out.println(number + " is " + result);

	}

}
//