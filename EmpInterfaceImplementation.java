package com.dev.myproject;

import java.util.HashMap;

public class EmpInterfaceImplementation implements Empinterface{

	 HashMap<String,Employee>  hm = new HashMap<String,Employee>();
	 
	public static void main(String[] args) {
	
	

	}

	@Override
	public void addEmployee(String value,Employee e) {
	hm.put(value, e);
	System.out.println("after adding employee :");
	System.out.println(hm);
	
	
		
	}

	@Override
	public void removeEmployee(String value) {
		hm.remove(value);
		System.out.println("data after removing employee");
		System.out.println(hm);
		
	}

}
