package com.calssofmay;


import java.util.Scanner;

public class IfElseGrade {

	public static  int NumOfCourses= 0; // the number of subjects taken
	public static int courseSize=0; //Number of courses taken
	public static String NameThecourse;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		

		System.out.println(" If you would like to see your grade,\n " + "please enter your response as Yes or No.\n");
		

		char letters = input.next().charAt(0);// This takes a answer from the user Yes or No
		

		if (letters == 'Y') { // Depending the previous answer it will get executed or not
			
			System.out.println("How many subjects are you taking?\n");

			NumOfCourses = input.nextInt(); // Determine array length
			
			String[] NameTheCourse = new String[NumOfCourses];
			
		
			System.out.println("\n");
			
               
			while (courseSize < NumOfCourses) { // Keep running until you find all the grade for the courses

				System.out.println("What is the course you are trying to see the grade for? \n");

				
				NameTheCourse[courseSize] = input.next();// Enter the name of the course
				

				System.out.println("\n");

				System.out.println("Please enter your score for " + NameTheCourse[courseSize] + " to see your grade.\n"); // Enter the score to see your grade
																										

				int score = input.nextInt(); // Receiving the score from the customer

				if (score >= 90) {

					System.out.println("Your Grade is  A\n");
				} else if (score >= 80) {

					System.out.println("Your Grade is  B\n");
				} else if (score >= 70) {

					System.out.println("Your Grade is  C\n");
				} else if (score >= 60) {

					System.out.println("Your Grade is  D\n");
				} else {
					System.out.println("You fell the class, please study hard!!\n");
				}
				
				System.out.println(NameTheCourse[courseSize]);
				courseSize++; // add until the its less thank or equal to the course size
				
				
			}
			if (IfElseGrade.courseSize < NumOfCourses) {
				System.out.println(NameTheCourse[NumOfCourses]);
			}
		
		} else {
			System.out.println("Sure, You can come back and look for another grade");
		}
	}
}
