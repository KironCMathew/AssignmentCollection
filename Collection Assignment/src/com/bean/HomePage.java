package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.service.Sorting;
import com.service.Validate;
public class HomePage {

	public static void main(String[] args) {
		System.out.println("1.Create Employee"
				+ " 2.Find employee"
				+ " 3.Exit");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Map<Employee,String> hm = new HashMap<Employee, String>(); 
		
		switch (num) {
		
		case 1:
			Employee employee = new Employee();
			Department department = new Department();
			Address address = new Address();
			Validate validate = new Validate();

					
	    System.out.println("Enter Employee ID. For eg: 12345_FS");
	    String employeeId = sc.next();
	    if(validate.validateEmployeeId(employeeId)) {
	    	employee.setEmployeeId(employeeId);
	    	System.out.println("Employee ID Set");
	    }
	    else
	    {
	    	System.out.println("Error! Please enter valid Employee ID");
	    	break;
	    }
		System.out.println("Enter the first name (First Letter Capital)");
		String firstName = sc.next();
		if(validate.validateName(firstName)) {
			employee.setFirstName(firstName);
			System.out.println("Employee First Name set");
		}
		else
		{
			System.out.println("Error! Please enter valid First Name");
			break;
		}
 		System.out.println("Enter the last name (First Letter Capital)");
 		String lastName= sc.next();
 		if(validate.validateName(lastName)) {
		  employee.setLastName(lastName);
		  System.out.println("Employee Last Name set");
 		}
 		else {
 			System.out.println("Error! Please enter valid Last Name");
 			break;
 		}
		System.out.println("Enter the salary in the range (20,000 -5,00,000");
		double salary = sc.nextDouble();
		if(validate.validSalary(salary))
		{
	    employee.setSalary(salary);
	    System.out.println("Salary set");
		}
		else
		{
			System.out.println("Error! Please enter valid salary");
			break;
		}
		System.out.println("enter the DOJ");
    	employee.setDateOfJoining(sc.next());

		System.out.println("Please enter other department related details");
		System.out.println("Please Enter Department ID");
		department.setDepartmentId(sc.next());
		System.out.println("Please Enter Department Name");
        department.setDepartmentName(sc.next());
		System.out.println("Please Enter Department Location");
		department.setLocation(sc.next());
		employee.setDepartment(department);
		
	    System.out.println("Please Enter Address ID");
	 	address.setAddressId(sc.next());
		System.out.println("Please Enter Address Line 1");
	    address.setAddressLine1(sc.next());
		System.out.println("Please Enter City");
		address.setCity(sc.next());
	    System.out.println("Please Enter State");
		address.setState(sc.next());
	    employee.setAddress(address);
	    System.out.println("ThankYou and have a nice day");
	
		hm.put(employee, employee.getEmployeeId());
		
		for(Map.Entry<Employee, String> entry : hm.entrySet())		 
		{
	 		 System.out.println(entry.getKey());
	 	 }
		break;
		  	
			
			
		case 2:
			int num1 = sc.nextInt();
			System.out.println("1. Sort By Employee ID");
			System.out.println("2. Sort By First Name");
			System.out.println("3. Sort By Last Name");
			System.out.println("4. Sort By Salary");
			System.out.println("5. Sort By Address");
			System.out.println("6. Sort By Department");
			
		    switch(num1) {
            case 1: 
            	 List<Employee> keyList = new ArrayList(hm.keySet());
			        List<String> valueList = new ArrayList(hm.values());
			        
			        Collections.sort(keyList, Sorting.EmployeeIdComparator); 
			        if(keyList.isEmpty())
			        {
			        	System.out.println("Please check your inputs");
			        }
			        else {
			        System.out.println("Sorted based on Employee Id");
			        keyList.forEach(System.out::println);
			        break;
			        }

        	case 2:
        	
		        List<Employee> keyList1 = new ArrayList(hm.keySet());
		        List<String> valueList1 = new ArrayList(hm.values());
		        
		        Collections.sort(keyList1, Sorting.FirstNameComparator); 
		        if(keyList1.isEmpty())
		        {
		        	System.out.println("Please check your inputs");
		        }
		        else {
		        System.out.println("Sorted based on First Name");
		        keyList1.forEach(System.out::println);
				break;
	         	}
        	
			
	
	        case 3: 
	        	 List<Employee> keyList2 = new ArrayList(hm.keySet());
			        List<String> valueList2 = new ArrayList(hm.values());
			        
			        Collections.sort(keyList2, Sorting.LastNameComparator); 
			        if(keyList2.isEmpty())
			        {
			        	System.out.println("Please check your inputs");
			        }
			        else {
			        System.out.println("Sorted based on Last Name");
			        keyList2.forEach(System.out::println);
					break;
		         	}
	     
		        
	        case 4:
	        	  List<Employee> keyList3 = new ArrayList(hm.keySet());
					List<String> valueList3 = new ArrayList(hm.values());
					        
					Collections.sort(keyList3, Sorting.SalaryComparator); 
					 if(keyList3.isEmpty())
					    {
					     System.out.println("Please check your inputs");
					    }
					  else {
					   System.out.println("Sorted based on Salary");
					   keyList3.forEach(System.out::println);
					   break;
			        }
	     
	        case 5:
	        	 List<Employee> keyList4 = new ArrayList(hm.keySet());
					List<String> valueList4 = new ArrayList(hm.values());
					        
					Collections.sort(keyList4, Sorting.AddressComparator); 
					 if(keyList4.isEmpty())
					    {
					     System.out.println("Please check your inputs");
					    }
					  else {
					   System.out.println("Sorted based on Address");
					   keyList4.forEach(System.out::println);
					   break;
			        }
	        case 6:
	        	
			        List<Employee> keyList5 = new ArrayList(hm.keySet());
					List<String> valueList5 = new ArrayList(hm.values());
			        
					Collections.sort(keyList5, Sorting.DepartmentComparator); 
					 if(keyList5.isEmpty())
					    {
					     System.out.println("Please check your inputs");
					    }
					  else {
					   System.out.println("Sorted based on Department");
					   keyList5.forEach(System.out::println);
					   break;
					  }
					 }
			       
	     
		case 3:
			System.out.println("Exited");
			break;
		
}
}
}


