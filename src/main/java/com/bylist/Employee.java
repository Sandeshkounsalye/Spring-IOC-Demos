package com.bylist;

import java.util.List;

public class Employee {
	private int empId;
	private String empName;
	private double empSalery;
	private List<Task> listOfList;
	
	

	public Employee(int empId, String empName, double empSalery, List<Task> listOfList) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalery = empSalery;
		this.listOfList = listOfList;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
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
	

	public List<Task> getListOfList() {
		return listOfList;
	}

	public void setListOfList(List<Task> listOfList) {
		this.listOfList = listOfList;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalery=" + empSalery + ", listOfList="
				+ listOfList + "]";
	}

	
	
	
}
