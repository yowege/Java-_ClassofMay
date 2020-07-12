package com.calssofmay;

class MyClassA{
	
	public void methodOne() {
		
	int i=25; //local variable for methodOne
	System.out.println("the value of i: "+ i);
	}

    public void methodTwo() {
	
	int j=20;// local variable for methodTwo
//	System.out.println("The value of i is :"+i); //ERROR
	System.out.println("The value of J is :"+j);
    }
	
    public void methodThree() {
    	
    	int j=10;// local variable for methodThree
 //   	System.out.println("The value of i is :"+i); //ERROR
    	System.out.println("The value of j is :"+j);
    }
    }
  public class Example5{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClassA mc=new MyClassA();/*THIS IS HOW OBJECT IS CREATED USING 
		                            *(class MyClass)from main  into main method
		                             */
		
		mc.methodOne();//this is to call the output of methodOne in Class MyClassA
		mc.methodTwo();
		mc.methodThree();

	
   }
}
