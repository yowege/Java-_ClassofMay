package com.calssofmay;


class Marks1 {

	//these variables are instance Variable
	
	int mathMarks = 100;
	int physicsMarks=98;
	int bioMarks= 74;
	
}
public class MarkDemo2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First object
		
		Marks1 obj1=new Marks1();
		obj1.mathMarks = 75;
		obj1.physicsMarks = 80;
		obj1.bioMarks = 90;
		
		//Second Object
		
		Marks1 obj2 = new Marks1();
		
		obj2.mathMarks = 85;
		obj2.physicsMarks = 45;
		obj2.bioMarks = 95;
		
		
		//Displaying marks for the first object
		
		    System.out.println("THe mark of the first object");
			System.out.println(obj1.mathMarks);
			System.out.println(obj1.physicsMarks);
			System.out.println(obj1.bioMarks);
			
			System.out.println("<==========================================>");
			//Display marks of the first Object 2
			
			System.out.println("THe mark of the second object");
			System.out.println(obj2.mathMarks);
			System.out.println(obj2.physicsMarks);
			System.out.println(obj2.bioMarks);
			
			System.out.println("<==========================================>");
			//THird object
			
			Marks1 obj3 = new Marks1();
			
			// Marks2 to be printed at once
			
			System.out.println("THe mark of the third object");
			System.out.println(+obj3.mathMarks+ "\n " +obj3.physicsMarks+ "\n " +obj3.physicsMarks);
			
			
			

	}

}



