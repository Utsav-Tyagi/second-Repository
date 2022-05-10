package com.cg.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try {
			FileInputStream f1=new FileInputStream("C:\\Users\\HP\\Desktop\\task.txt");
//		int ch=f1.read();
//		
//		System.out.println((char)ch);
			Scanner sc = new Scanner(f1);
			System.out.println("ALPHABETS");
		    while (sc.hasNextLine()) {
		      System.out.println(sc.nextLine());
		  }
		    
		    
		
		    
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
