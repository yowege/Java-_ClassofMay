package com.calssofmay;

class Animal {
	String color = " Black";

	void eat() {
		System.out.println("Animal is eating");

	}
}

class Dog extends Animal {

	String color = "White";

	@Override
	void eat() {
		System.out.println("Dog is eating");
	}

	void display() {

		System.out.println(color);
		System.out.println(super.color);//it takes the parent value and wont be overridden
		eat();
		super.eat(); //it takes the parent value and wont be overridden
	}
}

public class OverrideClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();

		d.display(); // the sub class override the superclass color

	}

}
