package com.calssofmay;

public class localVariable {

	public void methodone() {
		int j = 25; // <---------- local variable
		System.out.println("Value of j:" + j);
	}

	public void methodtwo() {
		int k = 30; // <---------- local variable
		System.out.println("Value of k:" + k);
		// System.out.println("Value of j:"+j); //← Error since j is in another method
	}

	public static void main(String[] args) {

		localVariable lv = new localVariable();

		lv.methodone();
		lv.methodtwo();

	}

}
