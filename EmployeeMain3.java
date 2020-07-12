package com.calssofmay;

import java.util.*;

public class EmployeeMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Employee> hm1 = new HashMap();
		
		Employee emp1 = new Employee();

		emp1.setEmpId(100);
		emp1.setEmpName("Hanif");
		emp1.setEmpSalary(30000.56);
		hm1.put(100, emp1);

		Employee emp2 = new Employee();
		emp2.setEmpId(200);
		emp2.setEmpName("Mohammed Iqbal");
		emp2.setEmpSalary(15000.67);
		hm1.put(200, emp2);

//	      Employee e1 = hm1.get(100);
//	      System.out.println(e1.getEmpId()+" "+e1.getEmpName()+ " "+e1.getEmpSalary());
//
//		  Employee e2 = hm1.get(200);
//	      System.out.println(e2.getEmpId()+" "+e2.getEmpName()+ " "+e2.getEmpSalary());

		
		
//		Set set = hm1.entrySet();
//
//		Iterator itr = set.iterator();
//
//		while (itr.hasNext()) {
//			
//			Map.Entry me = (Map.Entry) itr.next();
//			
//			System.out.println(me.getKey() + " ");
//			
//			Employee e1 = (Employee) me.getValue();
//			System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getEmpSalary());
//		}
		
		
		

	}

}
