package com.xworkz.chaining;

public class Institute extends Building {
	
	String name;
	String type;
	
	public Institute(String location, int noOfFloors, String name, String type) {
		super(location, noOfFloors);
		this.name = name;
		this.type = type;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(name);
		System.out.println(type);
	}
}
