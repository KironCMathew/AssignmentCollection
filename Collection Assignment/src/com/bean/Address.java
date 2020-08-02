package com.bean;

public class Address {
	private String addressId;
	private String addressLine1;
	private String city;
	private String state;
	public String getAddressId() {
		return addressId;
	}


	public Address(String addressId, String addressLine1, String city, String state) {
		super();
		this.addressId = addressId;
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
	}


	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", city=" + city + ", state=" + state
				+ "]";
	}

	}
