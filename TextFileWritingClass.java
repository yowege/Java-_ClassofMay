package com.calssofmay;

import java.io.*;

public class TextFileWritingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter writer = new FileWriter("C:\\Users\\yoweg\\Java class practice\\Reader File.txt", true);

			BufferedWriter bwriter = new BufferedWriter(writer);

			bwriter.write("import java.io.BufferedReader;\r\n" + 
					"import java.io.BufferedWriter;\r\n" + 
					"import java.io.FileReader;\r\n" + 
					"import java.io.FileWriter;\r\n" + 
					"\r\n" + 
					"public class FileInputOutputClass2 {\r\n" + 
					"\r\n" + 
					"	public static void main(String[] args) {\r\n" + 
					"		// TODO Auto-generated method stub\r\n" + 
					"\r\n" + 
					"		String fileinputName = \"C:\\\\Users\\\\yoweg\\\\Java class practice\\\\input.txt\";\r\n" + 
					"//		String fileoutputName = \"C:\\\\Users\\\\yoweg\\\\Java class practice\\\\output12.txt\";\r\n" + 
					"		try {\r\n" + 
					"			FileReader fr= new FileReader(\"C:\\\\Users\\\\yoweg\\\\Java class practice\\\\input.txt\");\r\n" + 
					"\r\n" + 
					"			BufferedReader br = new BufferedReader(fr);\r\n" + 
					"\r\n" + 
					"			\r\n" + 
					"			String line;\r\n" + 
					"			while((line= br.readLine()) != null) {\r\n" + 
					"				System.out.println(line);\r\n" + 
					"\r\n" + 
					"			}\r\n" + 
					"			br.close();\r\n" + 
					"		}\r\n" + 
					"		catch(Exception e) {\r\n" + 
					"			System.out.println(\"Error while reading from a file: \" + e.getMessage());\r\n" + 
					"		}\r\n" + 
					"		\r\n" + 
					"	}\r\n" + 
					"\r\n" + 
					"}");
			bwriter.newLine();
			bwriter.write("Good day!!");

			bwriter.close();

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
