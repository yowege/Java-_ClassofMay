package com.calssofmay;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList itr = new LinkedList();

		itr.add("Nega");
		itr.add("messi");
		itr.add(3);
		itr.add("Ronney");
		itr.add("Neymar");
		itr.add("Thomas");
		itr.add("Nuru");
		itr.add("Gashaw");

		Iterator A1 = itr.iterator();

		while (A1.hasNext()) {

			System.out.println(A1.next());
		}

	}

}
