package com.javapracticalslab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {

	public static boolean isValidMobileNo(String str) {
		Pattern ptrn = Pattern.compile("[a-z]*[a]+?[b]{3}");
		Matcher match = ptrn.matcher(str);
		return (match.find() && match.group().equals(str));
	}

	public static void main(String args[]) {
		String str = "dkajhfcefviwrhvrabbbb";
		if (isValidMobileNo(str))
			System.out.println("It is a valid .");
		else
			System.out.println("it is invalid.");
	}

}