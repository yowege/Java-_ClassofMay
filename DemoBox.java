package com.calssofmay;

public class DemoBox {

	double width;
	double height;
	double depth;

	DemoBox() {
		width = 5;
		height = 10;
		depth = 3;
	}

	DemoBox(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		return width * height * depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoBox b1 = new DemoBox(10, 20, 30);

		DemoBox b2 = new DemoBox(5, 10, 15);

		DemoBox b3 = new DemoBox();

		System.out.println(b1.volume());

		System.out.println(b2.volume());

		System.out.println(b3.volume());

	}

}
