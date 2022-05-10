package demo;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n= sc.nextInt();
		int m=n;
		int rev=0;
		while(n>0)
		{
			int a=n%10;
			rev=rev+(a*a*a);
			n=n/10;
			
		}
		if(rev==m) {
			System.out.println("armstrong "+ m);
			
		}
		else {
			System.out.println("Not armstrong "+ m);
		}

	}

}
