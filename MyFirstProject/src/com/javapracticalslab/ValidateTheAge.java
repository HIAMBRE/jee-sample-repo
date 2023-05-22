package com.javapracticalslab;

import java.util.Scanner;

public class ValidateTheAge extends Exception {

	public ValidateTheAge(String string) {
		System.out.println(string);
	}

	public static void main(String[] args) {
		int age;
		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		try {
			if (age < 15)

				throw new ValidateTheAge("invalid age");

			else

				System.out.println("valid age");

		} catch (ValidateTheAge e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

}
