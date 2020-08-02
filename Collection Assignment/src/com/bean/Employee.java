package com.bean;



public class Employee {
	private String employeeId;
	private String firstName;
	private String lastName;
	private double salary;
	private String dateOfJoining;
	private Department department;
	private Address address;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeId, String firstName, String lastName, double salary, String dateOfJoining,
			Department department, Address address) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.department = department;
		this.address = address;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", dateOfJoining=" + dateOfJoining + ", department=" + department
				+ ", address=" + address + "]";
	}
	



}
