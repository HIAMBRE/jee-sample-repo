package com.javapracticalslab;

import java.util.Scanner;

public class checkNumber {

	public static void main(String[] args) {
		int num,next = 0;
		System.out.println("Enter the number : ");
		Scanner sc =new Scanner(System.in);
		num=sc.nextInt();
		int tempvar=num;
		String s = Integer.toString(num);
		
		for(int i=1;i<s.length();i++)
		{
			if(i==0)
			{
				next=i+1;
			}
			if(next<s.length())
			{
				if(s.charAt(i)>s.charAt(next))
				{
					System.out.println(tempvar + "is an  increasing number");
				}
				else
				{
					System.out.println(tempvar + "is an not increasing number");
				}
			}
		}	
	}
}
