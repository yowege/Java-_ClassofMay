package com.calssofmay;

abstract class Figure1 {
	double dim1, dim2;

	Figure1(double a, double b) {
		dim1 = a;
		dim2 = b;

	}

	abstract double area();
}

class Rectangle extends Figure1{
	Rectangle (double a, double b){
		super(a,b);
	}
	double area() {
		System.out.print("The inside area of a Rectangle ");
		return dim1*dim2;
	}
	
}


public class AbstractDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figure1 rg = new Rectangle(12, 12);

		System.out.println(rg.area());
	}

}
