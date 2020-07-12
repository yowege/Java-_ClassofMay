package com.calssofmay;

public class ContinueStatmentExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 0; j <= 30; j++) {
			if (j % 13 == 0) {   //THis skips those which are divisible by 13
				continue;
			}
			System.out.println(j);
		} // for loop

	}

}
