package com.calssofmay;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] markOfStudent = { 67, 78, 80, 95, 55, 77 };

		for (int i = 0; i < markOfStudent.length; i++) {

			System.out.println(markOfStudent[i]);
		}

		for (int i : markOfStudent) {

			 System.out.println();
			
			
			System.out.println(i);
			
			
		}

	}

}
