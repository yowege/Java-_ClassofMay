package com.calssofmay;

import java.util.Scanner;

public class ArrayPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Print the number of the student");

		int NumbOfStudents = input.nextInt();

		String[] NameOfStudents = new String[NumbOfStudents];

		System.out.println("Please enter the name of students");

		for (int i = 0; i < NameOfStudents.length; i++) {

			NameOfStudents[i] = input.next();

			System.out.println("\n");

		}
		
		System.out.println("The list of students is: \n");

		for (String elt : NameOfStudents) {

			System.out.println(elt);

			System.out.println("\n");
		}

	}
}