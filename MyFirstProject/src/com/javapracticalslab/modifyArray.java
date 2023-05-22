package com.javapracticalslab;

import java.util.Scanner;

public class modifyArray {
	public static void main(String [] args)
	{
		int num;
		int j=0;
		int []arr = new int[100];
		System.out.println("Enter number of array elements : ");
		Scanner sc =new Scanner(System.in);
		num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<num-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j++]=arr[i];
			}
		}
		arr[j++]=arr[num-1];
		
	}
	
}
