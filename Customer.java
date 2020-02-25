package com.aiub.labexam;

public class Customer extends User {
	
	
	public String firstname, lastname, address;
	public Customer() {
		
	}

	public Customer(String firstname, String lastname, String address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", username="
				+ username + ", password=" + password + "]";
	}
	
}







