package com.javapracticalslab;

import java.util.Scanner;

public class Student {
	private String StudentId;
	private String studentName;
	private int creditPoints;
	/** @ */
//	default class
	public Student()
	{
		
	}
//	parameterized const
	public Student(String StudentId,String studentName)
	{
		this.StudentId=StudentId;
		this.studentName=studentName;
	}

	public static void main(String[] args) {
		String StudentId;
		String studentName;
		int creditPoints;
		System.out.println("Enter studentName and studentId ");
		Scanner scan =new Scanner(System.in);
		StudentId=scan.next();
		studentName=scan.next();
		if(StudentId.length()>4 )
		{
		System.out.println("Error");
		}
		
		if(studentName.length()>3)
		{
			System.out.println("Error");
		}
		else
		{
			Student stud=new Student();
		}
			
		
	}

}
