package com.calssofmay;

import java.util.*;

public class EmployeeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> ar1 = new ArrayList();

		Employee emp1 = new Employee();
			emp1.setEmpId(100);
			emp1.setEmpName("Hanif");
			emp1.setEmpSalary(30000.56);
		ar1.add(emp1);

		Employee emp2 = new Employee();
			emp2.setEmpId(200);
			emp2.setEmpName("Mohammed Iqbal");
			emp2.setEmpSalary(15000.67);
		ar1.add(emp2);

		for (Employee e1 : ar1) {

			System.out.println(e1.getEmpId() + " " 
							 + e1.getEmpName() + " " 
							 + e1.getEmpSalary());

		}

	}

}
