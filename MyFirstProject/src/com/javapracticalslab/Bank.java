package com.javapracticalslab;

class Person {
private String name;
private float age;
public Person(String name, float age) {
this.name = name;
this.age = age;
}
// Getters and setters for name and age attributes
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public float getAge() {
return age;
}

public void setAge(float age) {
 this.age = age;
}
}

class Account {
private static long accNumCounter = 1;
private final long accNum;
private double balance;
private final Person accHolder;

public Account(Person accHolder, double balance) {
this.accNum = accNumCounter;
accNumCounter++;
this.balance = balance;
this.accHolder = accHolder;
}
// Getters and setters for balance attribute
public double getBalance() {
return balance;
}
public void setBalance(double balance) {
this.balance = balance;
}
// Deposit method
public void deposit(double amount) {
balance += amount;
}
// Withdraw method
public void withdraw(double amount) {
if (balance - amount >= 500) {
balance -= amount;
} else {
System.out.println("Minimum balance of INR 500 not maintained.");
}
}
}
public class Bank{
public static void main(String[] args) {
// Create accounts for Smith and Kathy
Person smith = new Person("Smith", 25);
Account smithAcc = new Account(smith, 2000);
Person kathy = new Person("Kathy", 30);
Account kathyAcc = new Account(kathy, 3000);
// Deposit and withdraw from accounts
smithAcc.deposit(2000);
kathyAcc.withdraw(2000);
// Display updated balances
System.out.println("Smith's balance: INR " + smithAcc.getBalance());
System.out.println("Kathy's balance: INR " + kathyAcc.getBalance());
}
}

