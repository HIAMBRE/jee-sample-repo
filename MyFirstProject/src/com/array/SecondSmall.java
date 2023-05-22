package com.array;

import java.util.Arrays;

public class SecondSmall {

	public static void main(String[] args) {
	
		int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
//		sorting array in ascending order 
		Arrays.sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("Second smallest array is :"+array[1]);
	}
}
