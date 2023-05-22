//Create a method to find the sum of the cubes of the
//digits of an n digit number

package com.javapracticalslab;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0,num2=1;
		int number;
		int num3;
		
		Scanner sc = new Scanner(System.in);
		number=sc.nextInt();
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<number;i++)
		{
			
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			
		}
		

	}

}
