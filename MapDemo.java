package com.calssofmay;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map hm = new HashMap();
		  
		hm.put(1, "NameOne");
		hm.put(2, "NameTwo");
		hm.put(3, "NameThree");
		hm.put(2, "NameFour");//2= NameFour
		hm.put(4, "NameFour");//4 = NameFour
		hm.put(1, "NameOne");
//		hm.put("2", "qwerty");
		
//		System.out.println(hm.get(1)); //NameOne
//		System.out.println(hm.get(2)); //NameFour
//		System.out.println(hm.get(3)); //NameThree
//		System.out.println(hm.get(4)); //NameFour
//		System.out.println(hm.get("2"));
//		
//		
		// Get a set of the keys
		Set<Integer> keys  = hm.keySet();
		
		for(Integer key : keys) {
			System.out.println(key);
		}
//	
//		
		// Get a set of the entries
		Set se = hm.entrySet();
		
		//An Iterator iterate over a collection.
	    Iterator it= se.iterator();
	    
	 // Display elements 
		while(it.hasNext())
		{
			//The Map.entrySet method returns a collection-view of the map
		   Map.Entry me = (Map.Entry)it.next();
		  System.out.print(me.getKey() + " ");
		  System.out.println(me.getValue());
		}

		
	}

}