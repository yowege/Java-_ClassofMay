package com.calssofmay;


import java.util.*;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("messi");
		list.add("Ronney");
		list.add("Neymar");
		list.add("Kasahun");
		list.add("Mezmur");
		//list.add("3");
		
		
//		System.out.println(" Array Size: " +list.size());
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
//		
//		for(String se : list) {
//			System.out.println(se);
//		}
		
		
		
		
	}

}














