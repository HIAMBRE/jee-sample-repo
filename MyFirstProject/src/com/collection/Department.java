package com.collection;

public class Department implements Comparable<Department>{
int deptId;
String deptName;
String leaderName;
int noOfPerson;
public Department(int deptId, String deptName, String leaderName, int noOfPerson) {
	this.deptId=deptId;
	this.deptName=deptName;
	this.leaderName=leaderName;
	this.noOfPerson=noOfPerson;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public String getLeaderName() {
	return leaderName;
}
public void setLeaderName(String leaderName) {
	this.leaderName = leaderName;
}
public int getNoOfPerson() {
	return noOfPerson;
}
public void setNoOfPerson(int noOfPerson) {
	this.noOfPerson = noOfPerson;
}
@Override
public String toString() {
	return "Department [deptId=" + deptId + ", deptName=" + deptName + ", leaderName=" + leaderName + ", noOfPerson="
			+ noOfPerson + "]";
}
public int compareTo(Department d)
{	
	if(deptId==d.deptId)
	return 0;
	else if(deptId>d.deptId)
		return 1;
	else
		return -1;
	}

//public int compareTo1(Department d)
//{	
//	return deptName.compareTo(d.getDeptName());
//}
}