package com.xworkz.inheritance.single;

public class Samsung extends Mobile {
	int storage;

	public Samsung(String brand, int ram, int storage) {
		super(brand, ram);
		this.storage = storage;
	}
	
	@Override
	public String toString() {
		return "Brand= " + brand + "\n" + "Ram= " + ram + "\n" + "Storage= " + storage;
	}
	
}