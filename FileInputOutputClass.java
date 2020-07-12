package com.calssofmay;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		FileInputStream input =null;
//		FileOutputStream output  = null;
		
		try {
		FileInputStream input = new FileInputStream("C:\\Users\\yoweg\\Java class practice\\Doc for lab.txt");
			
		FileOutputStream output = new FileOutputStream("C:\\Users\\yoweg\\Java class practice\\Try2.txt");
			
			int i=0;
			while((i=input.read()) != -1) {
				System.out.print((char)i);
				output.write(i);
			}
			input.close();
		}
		catch(Exception e) {
			System.out.println("Error while read/write a file: " + e.getMessage());
		}
		
	}

}