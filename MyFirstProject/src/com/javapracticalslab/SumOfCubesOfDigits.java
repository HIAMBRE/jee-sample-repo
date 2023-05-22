package com.javapracticalslab;

public class SumOfCubesOfDigits {

	public static void main(String[] args) {
		int rem, num = 867, cubesum, sum = 0;
		//
		while (num !=0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
//		cubesum=n+n+n;
		System.out.println(sum);

	}

}
