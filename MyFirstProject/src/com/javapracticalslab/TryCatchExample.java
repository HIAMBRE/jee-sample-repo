package com.javapracticalslab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) throws FileNotFoundException {
		int num1;
		int num2;
		int ans;
		System.out.println("Enter two numebr : ");
		Scanner sc = new Scanner(System.in);
		FileReader reader = new FileReader("mytext.txt");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		try
		{
			ans=num1/num2;
			System.out.println(" "+ans);
		}catch(Exception e)
		{
			System.out.println("you are trying to divide the number by zero.");	
//			System.out.println(e.getMessage());
	}
		finally {
			//reader.close();
			System.out.println("Tis is finally sblock");
		}
		
		
}
}
