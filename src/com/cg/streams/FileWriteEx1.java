package com.cg.streams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		try {
			try (FileOutputStream file = new FileOutputStream("C:/Users/HP/Desktop/task.txt")) {
//				BufferedOutputStream buffer= new BufferedOutputStream(file,4);
//				buffer.write('A');
//				buffer.write('B');
//				buffer.write('C');
//				buffer.write('D');
//				buffer.write('E');
				
				file.write('A');
				file.write('B');
				file.write('C');
				file.write('D');
				//buffer.close();
			}
			
			System.out.println(" Completed......");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
