package com.example.demo.model;

import java.util.Date;

public class Employee {
	
	int id;
	String first_name;
	String last_name;
	int empDeptNo;
	Date empHireDate;
	boolean activ;
	
	public Employee()
	{
		super();
	}

	public Employee(int id, String first_name, String last_name, int empDeptNo, Date empHireDate, boolean activ) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.empDeptNo = empDeptNo;
		this.empHireDate = empHireDate;
		this.activ = activ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getEmpDeptNo() {
		return empDeptNo;
	}

	public void setEmpDeptNo(int empDeptNo) {
		this.empDeptNo = empDeptNo;
	}

	public Date getEmpHireDate() {
		return empHireDate;
	}

	public void setEmpHireDate(Date empHireDate) {
		this.empHireDate = empHireDate;
	}

	public boolean isActiv() {
		return activ;
	}

	public void setActiv(boolean activ) {
		this.activ = activ;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", empDeptNo="
				+ empDeptNo + ", empHireDate=" + empHireDate + ", activ=" + activ + "]";
	}
	
	

}
