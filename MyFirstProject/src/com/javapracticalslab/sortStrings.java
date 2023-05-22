package com.javapracticalslab;

import java.util.Scanner;

public class sortStrings {

	public static void main(String[] args) {
		String string;
		String str = null;
		int k;
		System.out.println("Enter String : ");
		Scanner sc = new Scanner(System.in);
		string=sc.nextLine();
		int length=string.length();
		str=(string.toUpperCase());
		
		System.out.println(str.substring(0,str.length()/2));
		
		String secondstring=str.substring(str.length()/2,str.length());
		System.out.println(secondstring.toLowerCase());
		
		
	}

}
