package com.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("gg");
		
		Matcher matcher =pattern.matcher("gggg");
		
		System.out.println("String matches the given Regex " + matcher.matches());
		// TODO Auto-generated method stub
 
//		System.out.println(Pattern.matches("[xyz]","xyz"));
	}

}
