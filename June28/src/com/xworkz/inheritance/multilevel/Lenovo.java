package com.xworkz.inheritance.multilevel;

public class Lenovo extends Laptop {
	
	String processor;

	public Lenovo(String brand, int ram, int storage, String processor) {
		super(brand, ram, storage);
		this.processor = processor;
	}
	
	@Override
	public String toString() {
		return "Brand= " + brand + "\n" + "Ram= " + ram + "\n" + "Storage= " + storage + "\n" + "Processor= " + processor;
	}
	
}
