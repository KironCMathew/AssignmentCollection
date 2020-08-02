package com.service;

public class Validate {
	public boolean validateEmployeeId(String id) {
		String pattern = "^[0-9]{5}_[A-Z]{2}$";
		return id.matches(pattern);
	}
	
	public boolean validateName(String name) {
		String pattern = "^[A-Z][a-z]+$";
		return name.matches(pattern);
	}
	public boolean validSalary(double salary) {
		if((salary >= 20000) && (salary <= 500000)) {
			return true;
		 }
		else {
			return false;
		     }
	}
}
