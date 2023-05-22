package com.javapracticalslab;

public class PositiveStringChecker {
	public static boolean isPositiveString(String str) {
		for (int i = 1; i < str.length(); i++) {
			char prevChar = str.charAt(i - 1);
			char currChar = str.charAt(i);
			if (prevChar > currChar) { // check if current character is before previous character in alphabetical order
				return false; // if not, string is not positive
			}
		}
		return true; // if we reach the end of the loop, the string is positive
	}

	public static void main(String[] args) {
		String str1 = "ANT";
		String str2 = "BEE";
		String str3 = "APPLE";

		System.out.println(isPositiveString(str1)); // true
		System.out.println(isPositiveString(str2)); // true
		System.out.println(isPositiveString(str3)); // false
	}
}
