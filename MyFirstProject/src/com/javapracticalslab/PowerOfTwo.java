package com.javapracticalslab;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		int num, flag=0;
		System.out.println(" Enter Number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int temp = num;
		while (num != 1) {
			if (num % 2 != 0) {
				flag = 1;
				break;
			}
			num = num / 2;
		}
		if (flag == 0)
			System.out.println(temp + " Is Power of 2");
		else
			System.out.println(temp + " Is not Power of 2");
	}
}
