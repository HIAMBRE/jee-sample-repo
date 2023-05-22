package com.javapracticalslab;

public class WrapperClass {

	public static void main(String[] args) {
		int a = 5;
		float f = 8.5F;
		String  s="200";
		int c =a;
		String s1="hello";
		String s2="hello";
		Integer aofobj = Integer.valueOf(a);
		Float bofobj = Float.valueOf(f);
		int sobj = Integer.parseInt(s);
		System.out.println("String parser");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("********");
		System.out.println(c);
		System.out.println(aofobj);
		System.out.println(bofobj);
		System.out.println(sobj);
		System.out.println("*****Printing value through Cammand line argument***** ");
		System.out.println(args[0]);
		System.out.println("*****Printing multiple values through Cammand line argument***** ");
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);
	}

}
