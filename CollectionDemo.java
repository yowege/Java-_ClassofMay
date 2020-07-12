package com.calssofmay;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Collection<Integer> values = new ArrayList();
		
		List<Integer> values = new ArrayList();

		values.add(4);
		values.add(6);
		values.add(9);
		values.add(9);
		values.add(6);
		values.add(2);

		Iterator it = values.iterator();// An iterator
		// System.out.println(values);

		while(it.hasNext()) {
			System.out.println(it.next());
		}

//		for (int i = 0; i < values.size(); i++) {
//			System.out.println(values.get(i));
//		}
//		for (Integer se : values) {
//			System.out.println(se);
//		}

	}

}
