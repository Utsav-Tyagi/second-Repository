package demo;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int m=n;
		int rev=0;int a;
		while(n!=0)
		{
			a=n%10;
			rev=(rev*10)+a;
		    n=n/10;
			
		}
		if(rev==m) {
		System.out.println("yes its a palindrome "+rev);
		}
		else {
			System.out.println("no "+rev);
		}
	}

}
