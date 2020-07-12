package com.calssofmay;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int Empid;
	private String Empname;
	private double Empsalary;
	
	public int getEmpId() {
		return Empid;
	}
	public void setEmpId(int empId) {
		this.Empid = empId;
	}
	public String getEmpName() {
		return Empname;
	}
	public void setEmpName(String empName) {
		this.Empname = empName;
	}
	public double getEmpSalary() {
		return Empsalary;
	}
	public void setEmpSalary(double empSalary) {
		this.Empsalary = empSalary;
	}
}