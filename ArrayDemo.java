package com.calssofmay;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nameOfStudnet = new String[100];

		nameOfStudnet[0] = "one";
		nameOfStudnet[1] = "two";
		nameOfStudnet[2] = "three";
		nameOfStudnet[3] = "Four";
		nameOfStudnet[4] = "Five";
		nameOfStudnet[5] = "Six";

//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(nameOfStudnet[2]);
//		System.out.println(nameOfStudnet[3]);
//		System.out.println(nameOfStudnet[4]);
//		System.out.println(nameOfStudnet[99]);

		for (int i = 0; i < nameOfStudnet.length; i++) {
			System.out.println(nameOfStudnet[i]);
		}

		
		//=================================
		
		int[] ageOfStudent = new int[5];

		ageOfStudent[0] = 11;
		ageOfStudent[1] = 12;
		ageOfStudent[2] = 13;
		ageOfStudent[3] = 14;
		ageOfStudent[4] = 15;

//		System.out.println(ageOfStudent[0]);
//		System.out.println(ageOfStudent[1]);
//		System.out.println(ageOfStudent[2]);
//		System.out.println(ageOfStudent[3]);
//		System.out.println(ageOfStudent[4]);

		for (int i = 0; i < ageOfStudent.length; i++) {

			System.out.println(ageOfStudent[i]);
		}

		// ================================

		char[] letters = new char[26];

		letters[0] = 'a';
		letters[1] = 'b';

		System.out.println(letters[0]);
		System.out.println(letters[1]);

		// ===========================

		double[] values = { 12, 13, 545, 67, 78, 798, 856, 56, 56, 56, 23 };

//		System.out.println();// NO VALUE IS PRINTED
//		System.out.println(values[0]);// GOT THE VALUE IN INDEX 0
//		System.out.println(values[5]);
//		

		for (double i : values) { // i will receive the data from values or values copy files to i

			System.out.println(i);
		}

		// ==============================

	}
}