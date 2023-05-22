package com.javapracticalslab;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to input the date of joining, employee ID, employee name, and current date
        System.out.print("Enter the date of joining (yyyy-mm-dd): ");
        String dojStr = sc.nextLine();
        LocalDate doj = LocalDate.parse(dojStr);
        
        System.out.print("Enter the employee ID: ");
        String empId = sc.nextLine();
        
        System.out.print("Enter the employee name: ");
        String empName = sc.nextLine();
        
        System.out.print("Enter the current date (yyyy-mm-dd): ");
        String currDateStr = sc.nextLine();
        LocalDate currDate = LocalDate.parse(currDateStr);
        
        // Calculate the number of years the employee has worked for the company
        Period period = Period.between(doj, currDate);
        int years = period.getYears();
        
        // Display the information
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date of Joining: " + doj);
        System.out.println("Years Worked: " + years);
    }
}
