 package com.cg.regex;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegExDemo1 {



public static void main(String[] args) {
	
	
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter first name");
String name = sc.next();
if(isValidName(name))
System.out.println("Valid name " +name);
else
System.out.println("Invalid name " +name);
//
//System.out.println("Enter 10 digits mobile number");
//String mobileNumber = sc.next();
//if(isValidMobileNumber(mobileNumber))
//System.out.println("valid number " + mobileNumber);



}//main^[a-zA-Z\\s]*$

public static boolean isValidName(String name) {
Pattern namePattern = Pattern.compile("[A-Z]{1}[a-zA-Z]{3,23}");
//Pattern namePattern = Pattern.compile("[A-Z]{1}\\s[a-z]{1}");
Matcher nameMatcher =namePattern.matcher(name);
return nameMatcher.matches();

}

//public static boolean isValidMobileNumber(String mobileNumber) {
//
//Pattern mobilePattern = Pattern.compile("[1-9]{1}[0-9]{9}");
//Matcher mobileMatcher =mobilePattern.matcher(mobileNumber);
//return mobileMatcher.matches();
//
//}
}