package com.calssofmay;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set=new TreeSet<String>();
		
		set.add("Rooney");
		set.add("Messi");
		set.add("Ronaldo");
		set.add("Martial");
		
		//traversing elements
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
	}

}
