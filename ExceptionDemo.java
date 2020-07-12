package com.calssofmay;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// int a = 12 / 0;
			// System.out.println("Result: " + a);

			int[] myarray = new int[5];
			myarray[6] = 34;

			double[] ar1 = { 20.5, 30.6, 40.7 };
			System.out.println(ar1[4]);
			
			
		}
		catch(Exception e) {  //This handles every exceptions
			
		}

//		} catch (ArithmeticException e) {
//
//		}

//		catch (ArrayIndexOutOfBoundsException e) {
//		} 
//		
//		catch (NullPointerException e) {
//
//		}
		
		finally {
			System.out.println("Hello world");
		}
		System.out.println("Hello World");
	}
}
