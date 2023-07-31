package com.xworkz.chaining;

public class Building {
	
	String location;
	int noOfFloors;
	
	public Building(String location, int noOfFloors) {
		this.location = location;
		this.noOfFloors = noOfFloors;
	}
	
	public void print() {
		System.out.println(this.location);
		System.out.println(this.noOfFloors);
		System.out.println("Invoked print of building");
	}
}
