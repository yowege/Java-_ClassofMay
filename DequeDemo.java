package com.calssofmay;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("CR7");
		deque.add("john legend");
		deque.add("messi");
		
		//Traversing elements
		for (String str : deque) 
		{
		System.out.println(str);
		}
		
	}

}
