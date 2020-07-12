package com.calssofmay;

import java.util.HashSet;
import java.util.Set;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> values = new HashSet();

		values.add(5);
		values.add(4);
		values.add(9);
		values.add(4);

		Iterator b1 = values.iterator();

		while (b1.hasNext()) {
			System.out.println(b1.next());
		}

//		 
//		 for(Integer i=0; i<values.size(); i++) {
//			 System.out.println(values);
//		 }

//		 for(int df : values) {
//			 System.out.println(df);
//		 }
//		
	}

}
