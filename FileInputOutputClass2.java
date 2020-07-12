package com.calssofmay;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileInputOutputClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileinputName = "C:\\Users\\yoweg\\Java class practice\\input.txt";
//		String fileoutputName = "C:\\Users\\yoweg\\Java class practice\\output12.txt";
		try {
			FileReader fr= new FileReader("C:\\Users\\yoweg\\Java class practice\\input.txt");

			BufferedReader br = new BufferedReader(fr);

			
			String line;
			while((line= br.readLine()) != null) {
				System.out.println(line);

			}
			br.close();
		}
		catch(Exception e) {
			System.out.println("Error while reading from a file: " + e.getMessage());
		}
		
	}

}