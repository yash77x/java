package com.xworkz.methodchaining;

public class Chicken {
	int price;
	String location;
	
	
	public Chicken(int price, String location) {
		this.price = price;
		this.location = location;
	}
	
	void printInfo()
	{
		System.out.println("Running printInfo in Chicken");
		System.out.println(this.price);
		System.out.println(this.location);

	}
	
}
