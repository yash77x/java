package com.xworkz.inheritance.multilevel;

public class Laptop extends Device {
	
	int ram;
	int storage;
	
	public Laptop(String brand, int ram, int storage) {
		super(brand);
		this.ram = ram;
		this.storage = storage;
		
	}
	
}
