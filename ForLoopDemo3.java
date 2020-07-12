package com.calssofmay;

public class ForLoopDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Print all even numbers
//		System.out.println("THIS PRINTS EVEN NUMBERS FORM 1 TO 50   \n");
//		
//		for(int i=0; i <= 50; i++) {
//			if ((i % 2) == 0) {
//				
//				System.out.println("This is one of the even number from 1 to 50 :"  +i );
//			}
//		}

		for(int i=0; i <= 50; i+=2) {
			
				
				System.out.println("This is one of the even number from 1 to 50 :"  +i );
				
				System.out.println("\n");
			}
		
		
		
		
		
		//Print all odd numbers
		
		System.out.println("THIS PRINTS ODD NUMBERS FORM 1 TO 50   \n");

		for(int i=0; i <= 50; i++) {
			if ((i % 2) != 0) {
				
				System.out.println("This is one of the even number from 1 to 50 :"  +i );
			}
		}
		  
	}

}
