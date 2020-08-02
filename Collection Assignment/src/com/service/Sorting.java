package com.service;

import java.util.Comparator;

import com.bean.Employee;

public class Sorting implements Comparator<Employee> {
	
public static final Comparator<Employee> EmployeeIdComparator = new Comparator<Employee>(){

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmployeeId().compareTo(o2.getEmployeeId()); 
    }
  
};
public static final Comparator<Employee> FirstNameComparator = new Comparator<Employee>(){

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFirstName().compareTo(o2.getFirstName()); 
    }
  
};

public static final Comparator<Employee> LastNameComparator = new Comparator<Employee>(){

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getLastName().compareTo(o2.getLastName()); 
    }
  
};

public static final Comparator<Employee> SalaryComparator = new Comparator<Employee>(){

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(Math.round(o1.getSalary() - (o2.getSalary()))); 
    }
  
};
public static final Comparator<Employee> AddressComparator = new Comparator<Employee>(){

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAddress().getAddressId().compareTo(o2.getAddress().getAddressId()); 
    }
  
};
public static final Comparator<Employee> DepartmentComparator = new Comparator<Employee>(){

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDepartment().getDepartmentId().compareTo(o2.getDepartment().getDepartmentId()); 
    }
  
};
@Override
public int compare(Employee o1, Employee o2) {
	// TODO Auto-generated method stub
	return 0;
}



}
