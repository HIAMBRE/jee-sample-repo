package com.javapracticalslab;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static int calculateSum (int num)
	{
		//int num1;
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int n;
		System.out.println("Enter Number");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		//int num;
		System.out.println("Sum is "+calculateSum(n));
		
	}

}
