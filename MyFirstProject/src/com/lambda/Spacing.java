package com.lambda;

import java.util.stream.Collectors;

interface functionalInterface
{
void abstarctfun(String str);
}
public class Spacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="CG";
		String s=str.chars().mapToObj(c->(char) c+ " ").collect(Collectors.joining()).trim();
		System.out.println(s);
	}

}
