package com.calssofmay;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks[][] = { { 50, 65, 70 }, //student 0
						  { 55, 68, 75 }, //student 1
				          { 57, 61, 78 }, //student 2
				          { 59, 60, 71 } }; //stuent 3

//print the marks 
		for (int i = 0; i < marks.length; i++) {

			System.out.println("Student : " + i);

			for (int j = 0; j < marks[i].length; j++) {

				System.out.println(marks[i][j]);
			}
		}
	}
}