package com.bean;

public class Department {
	private String departmentId;
	private String departmentName;
	private String location;



	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Department(String departmentId, String departmentName, String location) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.location = location;
	}


	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", location=" + location
				+ "]";
	}

	}
