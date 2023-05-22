package com.menudriven;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Sample {
	static List<Employees> emp=new ArrayList<Employees>();
	public static void main(String[] args) {
		int choice;
		
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		
		do {
			choice=sc.nextInt();
			System.out.println("1.Insert");
			System.out.println("2.display");
			System.out.println("1.update");
			System.out.println("1.delete");
			System.out.println("1.exit");
			switch(choice)
			{
			case 1:
				System.out.println("List Of Employees : ");
				emp.add(new Employees(1,20000,"hitesh"));
				emp.add(new Employees(2,25000,"rohit"));
				emp.add(new Employees(3,27000,"pappu"));
				emp.add(new Employees(4,17000,"nikhil"));
				emp.add(new Employees(5,18000,"shubham"));
				break;
			case 2:
				Iterator<Employees> it = emp.iterator();
				while(it.hasNext())
				{
					Employees n= it.next();
					System.out.println(n);
				}
			break;
			
			}
		}while(choice!=0);
	}
}
