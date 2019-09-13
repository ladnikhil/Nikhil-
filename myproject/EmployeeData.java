package com.dev.myproject;

import java.util.HashMap;

public class EmployeeData {
	
	static EmpInterfaceImplementation em = new EmpInterfaceImplementation();// to call other methods from empinterface

	public static void main(String[] args) {
		
		
		 HashMap<String, Employee>  hm = new HashMap<String, Employee>();
		 
		 
		 
		
		Employee e = new Employee();
		e.setEmpid(1);
		e.setName("nikhil");
		e.setEmail("ladnikhil55@gmail.com");
		e.setPassword("1234");
		e.setSalary(25000);
		
		
		Employee e1 = new Employee();
		e1.setEmpid(1);
		e1.setName("sanket");
		e1.setEmail("sanket55@gmail.com");
		e1.setPassword("1234");
		e1.setSalary(20000);
		

		Employee e2 = new Employee();
		e2.setEmpid(1);
		e2.setName("omkar");
		e2.setEmail("omkar55@gmail.com");
		e2.setPassword("12");
		e2.setSalary(18000);
		
		// to add data in employee management system
		em.addEmployee("1",e);
		em.addEmployee("2",e1);
		em.addEmployee("3",e2);
		
		System.out.println("====================================");
		
		//  to remove data in employee managament system
		
		em.removeEmployee("3");
		
		
		// to add data in employee management system
//		hm.put("1", e);
//		hm.put("2",e1);
//		hm.put("3",e2);
//		System.out.println(" data after adding the data in employee managament system ");
//		System.out.println(hm);
		
//		System.out.println("======to remove data in employee managament system==========");
		
		// to remove data in employee managament system
//		
//		Employee s = hm.remove("3");
//		System.out.println("data after removing  the data in employee managament system");
//		System.out.println(hm);
//		
		// to update a an email and salary in employee management system
		
		System.out.println("========to update a an email and salary in employee management system========");
		
		e.setEmail("rahul@gmail.com");
		e.setSalary(15000);
		System.out.println("data in employee management system after updating salary :");
		System.out.println(hm);
		
		
		System.out.println("========to get particular employee in employee management system====");
		// to get particular employee in employee management system
		
		System.out.println("name of employee 1 is "+e.getName());
		System.out.println("name of employee 2 is "+e1.getName());
		System.out.println("name of employee 3 is "+e2.getName());
		
		
		
		
		
		
		
	}
	

}
