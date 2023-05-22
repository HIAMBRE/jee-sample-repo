package com.menudriven;

public class Employees	{
	int empId;
	int empSalary;
	String empName;

	public Employees(int empId, int empSalary, String empName) {
		
		this.empId = empId;
		this.empSalary = empSalary;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public int getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empSalary=" + empSalary + ", empName=" + empName + "]";
	}

	}
