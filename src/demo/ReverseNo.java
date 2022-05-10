package demo;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int m=num;int a;
		int rev=0;
		while(num>0)
		{
			a=num%10;
			rev=(rev*10)+a;
			num=num/10;
			
		}
		System.out.println("The reverse of a number  is "+ rev);
		// TODO Auto-generated method stub

	}

}
