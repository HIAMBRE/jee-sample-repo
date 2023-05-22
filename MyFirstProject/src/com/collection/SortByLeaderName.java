package com.collection;

import java.util.Comparator;

public class SortByLeaderName implements Comparator<NewDepartment> {
public SortByLeaderName()
{
	
}

public int compare(NewDepartment o1,NewDepartment o2)
{
return o1.getLeaderName().compareTo(o2.getLeaderName());	
}
}
