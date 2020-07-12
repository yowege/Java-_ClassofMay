package com.calssofmay;

public class InstanceVariable
{
     int  age = 25;      //   <----  Declared outside methods 

		public void methodone() {
			int i = 10; // local variable
			System.out.println("Value of i:" + i);
			System.out.println("Value of  age:" + age);
		}

		public void methodtwo() {
			int k = 30; // local variable
			System.out.println("Value of k:" + k);
			System.out.println("Value of  age:" + age);
		}
public static void main(String[] agrs){

InstanceVariable Iv = new InstanceVariable();
Iv.methodone();
Iv.methodtwo();


}

   }