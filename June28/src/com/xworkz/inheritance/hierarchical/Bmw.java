package com.xworkz.inheritance.hierarchical;

public class Bmw extends Car {
	
	String steering;
	int noOfEngines;
	
	public Bmw(String brand, String steering, int noOfEngines) {
		super(brand);
		this.steering = steering;
		this.noOfEngines = noOfEngines;
	}
	
	@Override
	public String toString() {
		return "Brand= " + brand + "\n" + "Steering Position= " + steering + "\n" + "No Of Engines= " + noOfEngines;
	}

}
