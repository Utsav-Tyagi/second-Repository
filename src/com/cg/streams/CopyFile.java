package com.cg.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

	 
	
		 public static void main(String arg[])
		 {  
				// TODO Auto-generated method stub
			 
			 
			 
			    	try{
			    		FileInputStream fin =new FileInputStream("C:\\Users\\HP\\Desktop\\task.txt");
			    		FileOutputStream fout =new FileOutputStream("C:\\Users\\HP\\Desktop\\tagsk.txt");
			 
			    	     
			 
			    	    byte[] buffer = new byte[1024];
			 
			    	    int length;
			    	    /*copying the contents from input stream to
			    	     * output stream using read and write methods
			    	     */
			    	    while ((length = fin.read(buffer)) > 0){
			    	    	fout.write(buffer, 0, length);
			    	    }

			    	    //Closing the input/output file streams
			    	    fin.close();
			    	    fout.close();

			    	    System.out.println("File copied successfully!!");
			 
			    	}
			    	catch(IOException ioe){
			    		ioe.printStackTrace();
			    	 }
			    	System.out.println(" ===================================");
		    	try {
					FileInputStream f1=new FileInputStream("C:\\Users\\HP\\Desktop\\task.txt");

					Scanner sc = new Scanner(f1);
					System.out.println("Copied file data is");
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

//package com.cg.streams;
//
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
// 
//import java.io.IOException;
//import java.util.Scanner;
//
//public class CopyFile {
//
//	 public static void main(String arg[])
//	 {  
//			// TODO Auto-generated method stub
//		 
//		 
//		 
//		    	try{
//		    		FileInputStream fin =new FileInputStream("C:\\Users\\HP\\Desktop\\task.txt");
//		    		FileOutputStream fout =new FileOutputStream("C:\\Users\\HP\\Desktop\\tagsk.txt");
//		 
//		    	     
//		 
//		    	    byte[] buffer = new byte[1024];
//		 
//		    	    int length;
//		    	    /*copying the contents from input stream to
//		    	     * output stream using read and write methods
//		    	     */
//		    	    while ((length = fin.read(buffer)) > 0){
//		    	    	fout.write(buffer, 0, length);
//		    	    }
//
//		    	    //Closing the input/output file streams
//		    	    fin.close();
//		    	    fout.close();
//
//		    	    System.out.println("File copied successfully!!");
//		 
//		    	}
//		    	catch(IOException ioe){
//		    		ioe.printStackTrace();
//		    	 }
//		    }
//	
////		 public static void main(String arg[])
////		 {  
////				// TODO Auto-generated method stub
////			 
////			 try {
////				 FileInputStream fin =new FileInputStream("C:\\Users\\HP\\Desktop\\task.txt");
////		    		FileOutputStream fout =new FileOutputStream("C:\\Users\\HP\\Desktop\\tagsk.txt");
////		 
////		    	     
////		 
////		    	    byte[] buffer = new byte[1024];
////		 
////		    	    int length;
////		    	    /*copying the contents from input stream to
////		    	     * output stream using read and write methods
////		    	     */
////		    	    while ((length = fin.read(buffer)) > 0){
////		    	    	fout.write(buffer, 0, length);
////		    	    }
////			 
//////			 BufferedOutputStream buffer =null;
//////			    	try{
//////			    		FileInputStream fin =new FileInputStream("C:\\Users\\HP\\Desktop\\task.txt");
//////			    		FileOutputStream fout =new FileOutputStream("C:\\Users\\HP\\Desktop\\tagsk.txt");
//////			 
//////			    	     buffer =new BufferedOutputStream(fout);
//////			 
////////			    	    byte[] buffer = new byte[1024];
//////			 
//////char ch;
//////						//			    	    int length;
////////			    	     
////////			    	    while ((length = fin.read(buffer)) > 0){
////////			    	    	fout.write(buffer, 0, length);
////////			    	    }
////////			    	     System.out.println((char)ch);
////////			    		int ch=fin.read();
//////			    		int ch1=0;
//////			    		while((ch1=fin.read())!=1) {
//////			    			System.out.println((char)ch1);
//////			    			 
////////							FileOutputStream buffer;
//////							buffer.write(ch);
//////			    		}
////			    	    
////			    	    fin.close();
////			    	    fout.close();
////
////			    	    System.out.println("File copied successfully!!");
////			 
////			    	}
////			    	catch(IOException ioe){
////			    		ioe.printStackTrace();
////			    	 }
////			    	System.out.println(" ===================================");
////			    	try {
////						FileInputStream f1=new FileInputStream("C:\\Users\\HP\\Desktop\\task.txt");
//// 
////						Scanner sc = new Scanner(f1);
////						System.out.println("Copied file data is");
////					    while (sc.hasNextLine()) {
////					      System.out.println(sc.nextLine());
////					  }
////					    
////					    
////					
////					    
////					} catch (FileNotFoundException e) {
////						// TODO: handle exception
////						e.printStackTrace();
////					}
////					catch(IOException e) {
////						e.printStackTrace();
////					}
////			    	
////			    	
////			    }
//			 
// } 
//
//	
//
