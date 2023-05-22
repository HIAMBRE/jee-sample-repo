package com.assignment;

import java.util.*;

public class Cardetails {
public static void main(String[] args) {
Tatamotars car1 = new Tatamotars();
Scanner sc = new Scanner(System.in);

System.out.println("enter car regestration number");
car1.setCarid(sc.nextInt());

System.out.println("enter car model name");

car1.setCarname(sc.next());

System.out.println(car1.getCarname());

System.out.println(car1.carid);
}

}
