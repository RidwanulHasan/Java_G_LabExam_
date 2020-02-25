package com.aiub.labexam;

public class Inventorytest {

	public static void main(String[] args) {

		Customer customer1=new Customer("Ridwanul", "Hridoy",  "Bashundhrara, Dhaka, Bangladesh");
		customer1.id=1;
		customer1.username="hridoy";
		customer1.password="12345";
		Order order1=new Order(1, customer1, new Product(1001, "Realme X2 Pro", 23000.00));
		order1.printOrder();

	}




	}


