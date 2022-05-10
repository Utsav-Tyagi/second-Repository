package com.cg.streams;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Printstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

         
            try (PrintStream output = new PrintStream(new FileOutputStream("C:\\Users\\HP\\Desktop\\tasg.txt"))) {
				output.println("Apple");
				 output.println("Mango");
				 System.out.println("Done..........");
			}
          
            
        
        catch(Exception e) {
            e.getStackTrace();
        }
        
	}

}
