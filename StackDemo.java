package com.calssofmay;

import java.util.Iterator;
import java.util.Stack;



public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<String> stack = new Stack();
		
		
		stack.push("messi");
		stack.push("John");
		stack.push("Ronney");
		stack.push("Neymar");
		
		
		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		
		Iterator itr = stack.iterator();
		
		while(itr.hasNext()) {  
			
			System.out.println(itr.next());
		}
	}

}
