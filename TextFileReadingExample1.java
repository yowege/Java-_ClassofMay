package com.calssofmay;


import java.io.FileReader;
import java.io.IOException;

/**
* This program demonstrates how to read characters from a text file.
* @author Soresa
*
*/
public class TextFileReadingExample1 {

   public static void main(String[] args) {
       try {
           //FileReader reader = new FileReader("C:\\Users\\yoweg\\Java class practice\\Doc for lab.txt");
           FileReader reader = new FileReader("C:\\Users\\yoweg\\Java class practice\\input.txt");
           int character;

           while ((character = reader.read()) != -1) {
               System.out.print((char) character);
           }
           reader.close();

       } catch (IOException e) {
           e.printStackTrace();
       }
   }

}
