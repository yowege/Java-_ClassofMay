package com.calssofmay;



public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
		  *****-----The First way by defining arrays ************
		            ********************************
*/

//		String[] nameOfStudent = new String[5];
//
//		nameOfStudent[0]= "Amir";
//		nameOfStudent[1]= "Berhan";
//		nameOfStudent[2]= "Chilot";
//		nameOfStudent[3]= "Daniel";
//		nameOfStudent[4]= "James";
//		
//		System.out.println(nameOfStudent[0]);
//		System.out.println(nameOfStudent[1]);
//		System.out.println(nameOfStudent[2]);
//		System.out.println(nameOfStudent[3]);
//		System.out.println(nameOfStudent[4]);
//		
/*
		  ============== Using for loop =============================
		                ****************
*/

//
//		for(int i=0; i<5;i++) {
//			
//			System.out.println(nameOfStudent[i]);
//		}

		
/*
		 =======------ The second way by defining array length --------============***
		                ****************************************
 */

		
		String[] nameOfStudent = { "Amir", "Berhan", "Chilot", "Daniel", "James" };
        System.out.println(nameOfStudent.length);

//      System.out.println(nameOfStudent[0]);
//		System.out.println(nameOfStudent[1]);
//		System.out.println(nameOfStudent[2]);
//		System.out.println(nameOfStudent[3]);
//		System.out.println(nameOfStudent[4]);

/*
		  ============== Using for loop =============================
		                ****************
*/
//
//		for (int i = 0; i < nameOfStudent.length; i++) {
//
//			System.out.println(nameOfStudent[i]);
//		}
//		
/*
		  =======------ The third way by coping the array --------============***
		      =====-----****************************************-------===========
*/
		
//
		for(String Student:nameOfStudent) {
			
			System.out.println(Student);
		}
				
		
	}

}
