package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
		System.out.println("Enter Length of string ");
		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();
		String string[] = new String[length];
		System.out.println("Enter String input : ");
		
		for(int i = 0;i<length;i++)
		{
			string[i] = sc.nextLine();
		}
		System.out.println("display String input : ");
		for(int i = 0;i<string.length;i++)
		{
			
			Arrays.sort(string);
			System.out.println(string[i]);
		}
	}
}
