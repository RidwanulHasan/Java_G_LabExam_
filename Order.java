package com.aiub.labexam;

public class Order  {
	
	public int id;
	public Customer customer;
	public Product product;
	public Order() {
		
	}
	public Order(int id, Customer customer, Product product) {
		this.id = id;
		this.customer = customer;
		this.product = product;
	}
	
	public void printOrder() {
		System.out.println("Order Id: "+this.id);
		System.out.println("Customer Details: "+this.customer);
		System.out.println("Product Details: "+this.product);
	}
}



