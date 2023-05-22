package com.collection;

import java.util.Comparator;

public class SortByDepName implements Comparator<NewDepartment> {
public SortByDepName()
{
	
}

public int compare(NewDepartment o1,NewDepartment o2)
{
return o1.getDeptName().compareTo(o2.getDeptName());	
}
}
