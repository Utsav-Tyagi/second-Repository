package com.cg.streams;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class CopyImage {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub

		 BufferedImage image = ImageIO.read(new File("C:\\Users\\HP\\Desktop\\car.jpg"));
		 System.out.println(image);
		 
//		 BufferedImage image1 = ImageIO.write("C:\\Users\\HP\\Desktop\\bike.jpg");
//		 try{
//	    		FileInputStream fin =new FileInputStream("C:\\Users\\HP\\Desktop\\img.jpg");
//	    		FileOutputStream fout =new FileOutputStream("C:\\Users\\HP\\Desktop\\text.jpg");
//	 
//	    	     
//	 
//	    	    byte[] buffer = new byte[1024];
//	 
//	    	    int length;
//	    	    /*copying the contents from input stream to
//	    	     * output stream using read and write methods
//	    	     */
//	    	    while ((length = fin.read(buffer)) > 0){
//	    	    	fout.write(buffer, 0, length);
//	    	    }
//
//	    	    //Closing the input/output file streams
//	    	    fin.close();
//	    	    fout.close();
//
//	    	    System.out.println("File copied successfully!!");
//	 
//	    	}
//	    	catch(IOException ioe){
//	    		ioe.printStackTrace();
//	    	 }
	}

}
