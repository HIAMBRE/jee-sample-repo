package com.collection;

public class NewDepartment {
private int deptId;
private String deptName;
private String leaderName;
private int noOfPerson;

public NewDepartment(int deptId,String deptName,String leaderName,int noOfPerson)
{
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
	return "NewDepartment [deptId=" + deptId + ", deptName=" + deptName + ", leaderName=" + leaderName + ", noOfPerson="
			+ noOfPerson + "]";
}

}
