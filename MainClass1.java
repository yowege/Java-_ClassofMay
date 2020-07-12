package com.calssofmay;

abstract class Yonnas {
	Yonnas() {
		System.out.println("Base Constructor Called");
	}

	abstract void fun();
}

class Taddesse extends Yonnas {
	Taddesse() {
		System.out.println("Derived Constructor Called");
	}

	void fun() {
		System.out.println("Derived fun() called");
	}
}

public class MainClass1 {
	
	public static void main(String args[]) {
		Taddesse d = new Taddesse();
		d.fun();

	}
}




