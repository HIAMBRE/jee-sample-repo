package com.lambda;
interface FunctionalInterface
{
	abstract double power(int a,int b);
	}
public class Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterface p =(a,b) -> (Math.pow(a, b));
		System.out.println(p.power(2,4));	
	}
}
