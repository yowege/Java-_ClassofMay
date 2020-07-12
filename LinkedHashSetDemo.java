package com.calssofmay;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		set.add("Rooney");
		set.add("Messi");
		set.add("Martial");
		set.add("Ronaldo");
		set.add("");
		set.add("Martial");
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
	}

}
