package com.calssofmay;

class Marks {
	// these varables are instance Variable

	int mathMarks;
	int physicsMarks;
	int bioMarks;

}

public class MarkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First object

		Marks obj1 = new Marks();
		obj1.mathMarks = 75;
		obj1.physicsMarks = 80;
		obj1.bioMarks = 90;

		// Second Object

		Marks obj2 = new Marks();

		obj2.mathMarks = 85;
		obj2.physicsMarks = 45;
		obj2.bioMarks = 95;

		// Displaing marks for the first object

		System.out.println("THe mark of the first object");
		System.out.println(obj1.mathMarks);
		System.out.println(obj1.physicsMarks);
		System.out.println(obj1.bioMarks);

		// Display marks of the first Object 2

		System.out.println("THe mark of the second object");
		System.out.println(obj2.mathMarks);
		System.out.println(obj2.physicsMarks);
		System.out.println(obj2.bioMarks);

	}

}
