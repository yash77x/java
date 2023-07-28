package com.xworkz.equals.app;

public class Vehicle {
	
	private String color;
	private int price;
	private String model;
	private String name;
	private String type;
	
	public Vehicle(String color, int price, String model, String name, String type) {
		super();
		this.color = color;
		this.price = price;
		this.model = model;
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Name=" + name + "\n" + "Model=" + model + "\n" + "Type=" + type + "\n" + "Price=" + price + "\n" + "Color=" + color;	

	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null)
		{
			System.out.println("Object is not null, can proceed further");
			if(obj instanceof Vehicle) {
				Vehicle casted = (Vehicle) obj;
				if(this.name == casted.name && this.model == casted.model && this.type== casted.type && this.price == casted.price  && this.color == casted.color)
				{
					System.out.println("Both objects are same");
					return true;
				}
				else {
					System.err.println("Both are not same");
				}
				
			}
			else {
				System.err.println("Object is not mat");
			}
		}
		else {
			System.err.println("Object is null");
		}
		return false;
	}

}
