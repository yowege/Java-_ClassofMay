package com.calssofmay;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d= new Date();
//-----------------------------------------------------------------------------------------------------------------------
		
		SimpleDateFormat sdf1 =new SimpleDateFormat("dd-MM-yyyy");
		
		String str1 = sdf1.format(d);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
		String str2 = sdf2.format(d);
		
		System.out.println("The Current Date: " +str1);
		
		System.out.println("The Current Time: " +str2);
//-----------------------------------------------------------------------------------------------------------------------		
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MM-yyyy");
		 sdf3.setLenient(false);
		
		String str = "2019-04-22";
		
		try {
			Date date = sdf3.parse(str);
			System.out.println(date);
		}
		catch(ParseException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
//---------------------------------------------------------------------------------------------------------------------------		
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd-MM-yyyy");
		
		String str1 = "13-02-2019";
		String str2 = "13-02-2019";

		try {
			
			Date d1 = sdf4.parse(str1);
			Date d2 = sdf4.parse(str2);
			
			System.out.println(d1.compareTo(d2));
		}
		catch(ParseException e) {
			System.out.println("Invalid date format");
		}
		
		
	}

}