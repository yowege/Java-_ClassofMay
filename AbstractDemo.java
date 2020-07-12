package com.calssofmay;

abstract class Figure {

abstract void CalcArea(double length);
}

class FigureImp extends Figure {

	@Override
	void CalcArea(double length) {

		double result = length * length;
		System.out.println("Area of rectangle: " + result);

	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FigureImp abs = new FigureImp(); // Wrong

		abs.CalcArea(12);

	}

}
