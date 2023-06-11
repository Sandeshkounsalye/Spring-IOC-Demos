package com.entity;


public class Employee {
	private int empId;
	private String empName;
	private double empSalery;
	
	public Employee(int empId, String empName, double empSalery) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalery = empSalery;
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

	public double getEmpSalery() {
		return empSalery;
	}

	public void setEmpSalery(double empSalery) {
		this.empSalery = empSalery;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalery=" + empSalery + "]";
	}
	
	
	
}
