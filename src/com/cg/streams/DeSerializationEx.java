package com.cg.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DeSerializationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("TejShree");
		e1.setAddress("Mumbai");
		
		ObjectOutputStream objectOutput=null;
		FileOutputStream fo=null;
		try {
			//fo= new FileOutputStream("C:\\Users\\HP\\Desktop\\emp.ser");
			fo= new FileOutputStream("C:\\Users\\HP\\Desktop\\emp1.txt");
			objectOutput=new ObjectOutputStream(fo);
			objectOutput.readObject(e1);
			 
			
			System.out.println("Success ......");
			System.out.println("Object has been deserialized"); 
			System.out.println("Id = " + e1.getId());
         System.out.println("Name = " + e1.getName());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		try
//        {   
//            // Reading the object from a file
//            FileInputStream file = new FileInputStream(filename);
//            ObjectInputStream in = new ObjectInputStream(file);
//              
//            // Method for deserialization of object
//            object1 = (Demo)in.readObject();
//              
//            in.close();
//            file.close();
//              
//            System.out.println("Object has been deserialized ");
//            System.out.println("a = " + object1.a);
//            System.out.println("b = " + object1.b);
//        }
//          
//        catch(IOException ex)
//        {
//            System.out.println("IOException is caught");
//        }
//          
//        catch(ClassNotFoundException ex)
//        {
//            System.out.println("ClassNotFoundException is caught");
//        }
  

	}

}
