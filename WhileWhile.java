package com.calssofmay;

import java.util.Scanner;

public class WhileWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the number of the employee");

		int size = input.nextInt();
		String[] nameOfEmployee = new String[size];

		System.out.println("Please enter the name of those  " + size + " employee");

		int i = 0;
		int j = 1;
		while (i < nameOfEmployee.length) {

			System.out.print("Employee name is " + j + " ");

			nameOfEmployee[i] = input.next();

			i++;
			j++;

		}
		
		int k=0, l =1;
		System.out.println("\n");
		
		System.out.println("The list of employees is: ");
		
		while(k<nameOfEmployee.length) {
			
			
			System.out.print(l);
			System.out.println(" " +nameOfEmployee[k]);
			
			k++;
			l++;
		}

	}

}
