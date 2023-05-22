package com.menudriven;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class menu
{
int empId;
String empName;
public menu(int empId, String empName) {
	
	this.empId = empId;
	this.empName = empName;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

@Override
public String toString() {
	return "[empId=" + empId + ", empName=" + empName + "]";
}
}

public class Crud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<menu> c = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.insert");
			System.out.println("2.Display");
			System.out.println("3.delete");
			System.out.println("4.update");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter Employee id: ");
				int eno=sc.nextInt();
				System.out.print("Enter Employee Name: ");
				String ename=sc1.nextLine();
				c.add(new menu(eno,ename));
				break;
			case 2:
				Iterator<menu> i = c.iterator();
				while(i.hasNext())
				{
					menu m = i.next();
					System.out.println(m);
				}
				break;
			case 3:
				System.out.println("Enter Id you want to delete : ");
				int id= sc.nextInt();
				int found;
				Iterator<menu> it = c.iterator();
				while(it.hasNext())
				{
					menu m = it.next();
					if(m.getEmpId()==id)
					{
						it.remove();
						found=1;
						System.out.println("Record deleted");
					}
					else
					{
						System.out.println("record not found");
					}
					
				}
				break;
				
			case 4:
				int found1=0;
				System.out.println("Enter emp to update:");
				int no=sc.nextInt() ;
				Iterator<menu> iter = c.iterator();
				while(iter.hasNext())
				{
					menu m1 = iter.next();
					if(m1.getEmpId()==no)
					{
						
						System.out.println("Enter new name");
						String name=sc.nextLine();
					//	iter.set(new menu(eno,ename));
					}
					else if(found1==0)
					{
						System.out.println("record not found");
					}
					else
						System.out.println("record updated successfully..");
				}	
			}
		}while(ch!=0);

	}

}
