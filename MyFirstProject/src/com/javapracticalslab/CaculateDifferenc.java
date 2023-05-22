package com.javapracticalslab;

import java.util.Scanner;

public class CaculateDifferenc {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter Number ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
//		sum of squares natural no. 
		int sumofsquaren = n*(n+1)*(2*n+1)/6;
//		sum of natural number
		int sumofn = n*(n+1)/2;
		//square of natural numberes
		int sqauresumnaturalno= sumofn*sumofn;
//		difference 
		int diff =(sqauresumnaturalno-sumofsquaren);
		System.out.println(diff);
		
	}

}
