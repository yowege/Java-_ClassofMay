package com.calssofmay;

 class EmpClass1 {
	  static String city ="New York";
	  String  name = "Mohammed Ismail";
	  int  age = 30;
	
public class  ClassMain1 {
	
}
	public static void main(String args[])
{   
	  EmpClass1   emp1 = new EmpClass1();
	  
	  EmpClass1.city = "Dallas";
            // emp1.city = "Chicago";
             
             emp1.name = "Abdul Jabar";
	  
	  System.out.println("city:"+EmpClass1.city);     // EmpClass1.city
	  System.out.println("name:"+emp1.name);
	 
	  System.out.println("----------------------");
      EmpClass1   emp2 = new EmpClass1();
	  
	  System.out.println("city:"+EmpClass1.city);    // EmpClass1.city
	  System.out.println("name:"+emp2.name);
	  
	  }
}
