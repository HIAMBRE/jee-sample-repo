package com.javapracticalslab;

import java.util.Scanner;

public class getImage {

	public static void main(String[] args) {
		String str;
		String reversedstr="";
		System.out.println("Enter String : ");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		String temp=str;
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			reversedstr=reversedstr+str.charAt(i);
		}
		System.out.println("Mirror image is : "+temp+" | "+reversedstr);
	}
}
