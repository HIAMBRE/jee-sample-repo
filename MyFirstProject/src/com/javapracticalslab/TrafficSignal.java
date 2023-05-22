package com.javapracticalslab;

import java.util.Scanner;

public class TrafficSignal{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		switch (choice) {
		case"red": {
		System.out.println("STOP");
		break;
		}
		case "yellow": {
		System.out.println("READY");
		break;
		}
		case "green": {
		System.out.println("GO");
		break;
		}
		default :
		{
			System.out.println("wrong choice");
}
}
}
}