package com.calssofmay;

public class StringHandlerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "James";

		name.concat("Bond");// Name is James Bond

		System.out.println(name);// it gives only James therefore Stings are immutable
		System.out.println(name.concat(name));// Concatenation is working

		String str1 = new String("Hello World  \n");// definition of string

//-------*****Concatenation of strings******-----------//
		
		System.out.println("\n------------------(+)  is used to concatnate strings----\n");

		String strnew = "I" + "Like" + "Java" + "Language";// We can use plus sign to concatenate Strings

		System.out.println(strnew +"\n");
		//index = 0  1 2 3 4 5 6 
		//length= 1  2 3 4 5 6 7 
		String strnew2 = "hello";// Space is counted as length too

///-------*****(.length) gives the string length ******-----------// 
		
		System.out.println("\n------------------(.length)  gives the string length----\n");

		System.out.println(strnew2.length());// Returns the length of the string
		System.out.println("the string length for hello is :" +strnew2.length());// this shows 6 including space
		
///-------*****(.charAt()) locates the character in a string ******-----------// 
		
				System.out.println("\n------------------(.charAt()) locates the character ina string----\n");		

		String str2 = "This is Hanif";
		System.out.println("The third char for (THis is Hanif) is : " +str2.charAt(3) +" \n");// This will show the third character of the string 

//-------*****(.equals)  it compares two strings ******-----------// 
		
				System.out.println("\n------------------(.equals)  it compares two strings----\n");

		String str3 = "Ismail";
		String str4 = "Ismael";

		if (str3.equals(str4)) {

			System.out.println("The two stirngs are equal\n");
		} else {
			System.out.println("These strings are not equal\n");

		}

//-------*****(.equalsIgnoreCases) ignores either upper or lower cases when it compares two strings ******-----------// 
		
		System.out.println("\n------------------(.equalsIgnoreCases) ignores either upper or lower cases when it compares two strings----\n");

		String str5 = "Ismail";
		String str6 = "Ismael112234";

		if (str5.equalsIgnoreCase(str6)) {

			System.out.println("The two stirngs are equal \n");
		} else {
			System.out.println("These strings are not equal \n");
		}

//-------*****Checks if the string has digits ******-----------//     
		System.out.println("\n------------------Checks if the string has letters----");

		String str7 = "q56A7c5";
		char ch;
		for (int i = 0; i < str7.length(); i++) {

			ch = str7.charAt(i);
			
			/* index  cha  length
			 * 0       q	1
			 * 1       5	2
			 * 2	   6	3
			 * 3	   A	4
			 * 4	   7	5
			 * 5	   c	6
			 * 6	   5	7
			 */

			System.out.print(ch + " ");

			if (Character.isDigit(ch)) {
				System.out.println("It is a Digit");
			} else {
				System.out.print("String contains letter");
				System.out.println(" ");
			}

		}
		
//*****Index of the string ******-----------//  
		
		System.out.println("\n------------------Index position of a string----\n");		
		

		String str8 = "Today is holiday Tomorrow is working day";
		
		/* index  cha  length
		 * 0       T	1
		 * 1       o	2
		 * 2	   d    3
		 * 3	   A	4
		 * 4	   y	5
		 * 5	   " "	6
		 * 6	   i	7
		 * 7       s    8
		 * 8       " "  9
		 * 9       h    10
		 * 10	   o 
		 * 11	   L
		 * 12      I
		 * 13      D
		 * 14      A
		 * 15      Y
		 * 16
		 */
		
		int loc = str8.indexOf("holiday");
		
		System.out.println("Position of holiday is :" +loc +"\n");
		
//-------------------*****(.substring(a,b) cuts the index of the string between given index numbers ******-----------//  
		
		System.out.println("\n------------------Shows the word beteween the first the last index that was given----\n");	
		
		String sub1 =str8.substring(9,16);// the count of indexes includes empty spaces
		
		System.out.println("The string between index 6 & 16 is :" + sub1);
		
//*****Index of the string ******-----------// 
		
		System.out.println("\n------------------(.split)  splits the string ( In this case at empty spaces----\n");			
		
		//String str8 = "Today is holiday Tomorrow is working day";
		
		String[] ar1 = str8.split(" ");// according to this it splits the sentence at empty space
		
		for(int i=0; i< ar1.length ; i++) {
			System.out.println(ar1[i] );
		}
		
//*****(.compareTo) Compares the strings and returns their ASCII code result  ******-----------//  
		
				System.out.println("\n------------------(.compareTo) Compares the strings and returns their ASCII code result----\n");			
		

		String str9 = "Abdul";
		String str10 = "         abdul          ";
		
		System.out.println(str10);

		int b1 = str9.compareTo(str10);// this will return negative Since lower case has bigger ASCII NUMBER
		System.out.println(b1 +"\n");

//*****(.replace(1, by 2) Helps to replace characters in the string ******-----------//  
		
		System.out.println("\n------------------(.replace(1, by 2) Helps to replace characters in the string----\n");		

		String str11 = "Helllllllllllllllllllllllllo";
		String str12 = str11.replace('l', '*');
		System.out.println(str12);
		
		

//*****(.trim) Helps to trim unnecessary empty space in the string ******-----------//  
				
			System.out.println("\n------------------(.trim) Helps to trim unnecessary empty space in the string and gives lower string length----\n");	
				
				
		String str13 = str10.trim();
		System.out.println("This string length is before trim : " +str10.length());
		System.out.println("This is string length is after trim : "+ str13.length());
		
//*****(.toLowerCases) Helps to change upper case characters in a string to lower case ******-----------//  
		
		System.out.println("\n------------------(.toLowerCases) Helps to change upper case characters in a string to lower case----\n");		


		String str14 = "Java Language";
		System.out.println("This is the given sentence:  "  +str14 +"\n");
		String str15 = str14.toLowerCase();
		System.out.println("This is after its characters are changed to lowercase:  " +str15 +"\n");

//*****--------------------------------------StringBuffer------------------------------------------------------------//  
		
				System.out.println("\n------------------StringBuffer----\n");		
		

	
	
	StringBuffer str16 = new StringBuffer("Hello");// String Buffer
    
    // str16 = str16;
	  str16.insert(5, " world!!!!") ;  //   Result will be ‘Hello World’

	 System.out.println(str16);
	
}
}
