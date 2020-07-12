package com.calssofmay;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		 
		  emp1.setEmpId(100);
		  emp1.setEmpName("Craft");
		  emp1.setEmpSalary(30000.56);
		  
      Employee  emp2 = new Employee();
		  
		  emp2.setEmpId(200);
		  emp2.setEmpName("Yonnas");
		  emp2.setEmpSalary(15000.67);
		  
		  System.out.println(emp1.getEmpId()+" "+emp1.getEmpName()+ " "+emp1.getEmpSalary());
		  System.out.println(emp2.getEmpId()+" "+emp2.getEmpName()+ " "+emp2.getEmpSalary());
		}


	}


