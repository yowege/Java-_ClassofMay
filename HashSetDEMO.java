package com.calssofmay;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class HashSetDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Set<String> set=new HashSet();
		
		set.add("Rooney");
		set.add("Messi");
		set.add("Ronaldo");
		set.add(" ");
		set.add("Yonnas");
		set.add("Yonnas");
		
		
        Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {  
			
			System.out.println(itr.next());
		}
	}

}
