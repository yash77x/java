package com.xworkz.inheritance.hierarchical;

public class Mercedes extends Car {
	
	int maxSpeed;
	String model;

	public Mercedes(String brand, int maxSpeed, String model) {
		super(brand);
		this.maxSpeed = maxSpeed;
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Brand= " + brand + "\n" + "Max Speed= " + maxSpeed + "\n" + "Model= " + model;
	}
	
}
