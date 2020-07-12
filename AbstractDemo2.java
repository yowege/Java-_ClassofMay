package com.calssofmay;

abstract class A {
	abstract void callme();

	abstract void callme1();

	void callmetoo() {
		System.out.println("This is a concrete method");
	}
}

class B extends A {

	@Override
	void callme() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of callme by object B");
	}

	@Override
	void callme1() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of Callme1");
	}

}

public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B(); // or we can use A b=new B();
		b.callme();
		b.callmetoo();
		b.callme1();

	}

}
