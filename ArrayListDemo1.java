package com.calssofmay;

import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<String> list = new ArrayList();

		System.out.println("Please Enter the size of the array");
//Taking the size of the array from the user
		int size = input.nextInt();
//Entering dalta list
		for (int i = 0; i <= size; i++) {
			System.out.println("PLEASE ENTER your arraylist element");
			list.add(input.next());
			
		}
		System.out.println("\n");
//		list.remove(2);// This removes a specific array element according to the given index
		
		
//		System.out.println(" Array Size: " + list.size());
//		System.out.println("\n "+ list + " \n ");

		Iterator itr = list.iterator();


		while (itr.hasNext()) 
        { 
			String ent = (String)itr.next(); 
            if (ent.equals("Craft")) 
            {
                itr.remove();
            }
           
        }
		 System.out.println(list);
		

		
		//Using Enhansed for loop to print out
//		for (String se : list) {
//			System.out.println(se);
//		}
//
	}

}
