package com.calssofmay;

import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Stack;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> queue = new PriorityQueue();
		
		queue.add("Wayne Ronney");
		queue.add("Soresa Hailu");
		queue.add("Marcus rashford");
		queue.add("Yonnas Taddesse");
		queue.add("Anthony Martial");
		
//		System.out.println("Head : "+queue.element());
		

		Iterator itr = queue.iterator();

		while(itr.hasNext()) {  
	
			System.out.println(itr.next());
}
	}

}
