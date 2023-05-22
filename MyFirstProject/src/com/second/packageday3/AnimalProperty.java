package com.second.packageday3;

import java.util.Scanner;

import com.first.packageday3.Animal;

public class AnimalProperty {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.display();
		//animal.animalid;  private 
		//animal.animalname;   protected 
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		System.out.println(name);
	}
}
