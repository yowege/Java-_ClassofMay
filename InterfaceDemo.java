package com.calssofmay;

interface Animal1 {
	public abstract void eat();//by default they are abstract and public

	public void travel();
	
	static void display() {
		System.out.println("This is animal class");
	}
}

class Mammal implements Animal1 {

	public void eat() {
		System.out.println("Mammal eats");
	}

	public void travel() {
		System.out.println("Mammal travels");
	}

	public int noOfLegs() {
		return 0;
	}
	void display1() {
		System.out.println("This is Mammal class");
	}

	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mammal m = new Mammal();
		m.eat();
		m.travel();
		Animal1.display();
		m.display1();
	}

}
