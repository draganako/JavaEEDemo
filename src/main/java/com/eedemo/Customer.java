package com.eedemo;

public class Customer {
	private String firstName;
	private String lastName;
	private String phone;
	
	public Customer() {
		this.firstName = "";
		this.lastName = "";
		this.phone = "";
	}
	
	public Customer(String firstName, String lastName, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}