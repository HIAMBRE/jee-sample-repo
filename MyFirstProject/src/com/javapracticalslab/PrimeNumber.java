package com.javapracticalslab;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args)
{
int prime;
int num;
System.out.println("Enter Number");
Scanner sc = new Scanner(System.in);
num=sc.nextInt();
for(int i=2;i<num;i++)
{
	prime=0;
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
			prime=1;
	}
	if(prime==0)
			
			System.out.println(i);
		
	}
}
}
