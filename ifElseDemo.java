package com.calssofmay;

import java.util.Scanner;

public class ifElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		
        System.out.println("Please enter your number");
		
        
        int num = input.nextInt();
	
		if (num % 2 == 0) {

			System.out.println("it is Even number");
		}
	
		else {
			System.out.println("It is odd number");
		}

		
		
	}

}
