package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DepartmentSample {

	public static void main(String[] args) {
		List<NewDepartment> dept = new ArrayList<NewDepartment>();
		dept.add(new NewDepartment(101,"HR","vivek",5));
		dept.add(new NewDepartment(103,"HR","sham",7));
		dept.add(new NewDepartment(105,"Finance","raju",9));
		dept.add(new NewDepartment(107,"Marketing","Pappu",4));
		
		Collections.sort(dept,new SortByLeaderName());
		Collections.sort(dept,new SortByDepName());
		
		Iterator<NewDepartment> it = dept.iterator();
		while(it.hasNext())
		{
			NewDepartment n= it.next();
			System.out.println(n);
		}
		
	}

}
