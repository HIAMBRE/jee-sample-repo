package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DepartmentComparable {

	public static void main(String[] args) {

		List<Department> deplist = new ArrayList<>();
		deplist.add(new Department(212, "hitesh", "kop", 10));
		deplist.add(new Department(205, "abc", "mop", 20));
		deplist.add(new Department(204, "pqr", "cop", 6));
		deplist.add(new Department(208, "xyz", "sap", 8));
		deplist.add(new Department(210, "stu", "main", 5));

		Collections.sort(deplist);
		Iterator<Department> it = deplist.iterator();
		System.out.println("sorted by id :");
		while (it.hasNext()) {
			Department d = it.next();
			System.out.println(d);
		}
		
//		if(deplist.get(0).compareTo(deplist.get(1))==0)
//		{
//			System.out.println("Objects are same");
//		}
//		System.out.println("***********before sorting*************");
//		Iterator<Department> itr = deplist.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		Collections.sort(deplist);
//		System.out.println("***********After sorting*************");
//		Iterator<Department> itr1 = deplist.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr1.next());
//		}
//		
	}
}
