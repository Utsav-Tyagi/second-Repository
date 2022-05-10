package demo;
import java.util.*;
public class prog1 {
	
	int nsv=0;
	static int sv=0;
	
	 public prog1() {
		 nsv++;
		 sv++;
	 }
	 public void display() {
		 System.out.print(nsv);
		 System.out.println(sv);
		 System.out.println("");
	 }
	
	 
	public static void main(String []args)
	{
		 prog1 demo= new prog1();
		 demo.display();
		 prog1 demo1= new prog1();
		 demo1.display();
		 prog1 demo2= new prog1();
		 demo2.display();
		
	}

}
