package com.calssofmay;

class StaticVariable2 {

	public static String city = "New York";
	String name = "Mohammed Ismail";
	int age = 30;

	public static void main(String args[]) {

		System.out.println("city:" + StaticVariable2.city);
		// System.out.println("name:"+StaticVariable2.name);//Can not make a static
		// reference to non static field
		// System.out.println("age:"+StaticVariable2.age);//Can not make a static
		// reference to non static field

		StaticVariable2 emp1 = new StaticVariable2();

		StaticVariable2.city = "Addis Ababa";

		emp1.name = "Mohammed I";

		System.out.println("city:" + StaticVariable2.city); // StaticVariable2.city
		System.out.println("name:" + emp1.name);
		System.out.println("age:" + emp1.age);

		System.out.println("----------------------");

		StaticVariable2 emp2 = new StaticVariable2();

		System.out.println("city:" + StaticVariable2.city); // EmpClass1.city
		System.out.println("name:" + emp2.name);
		System.out.println("age:" + emp2.age);
	}
}
