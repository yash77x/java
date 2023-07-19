package com.xworkz.casting;

public class PumaShoe extends Shoes{
	String model;
	String origin;

	public PumaShoe(int price, Size size, Color color, String model, String origin) {
		super(price, size, color);
		this.model = model;
		this.origin = origin;
	}
	
	void printInfo() {
		System.out.println("Price = "+price);
		System.out.println("size = "+size);
		System.out.println("color = "+color);
		System.out.println("model = "+this.model);
		System.out.println("origin = "+this.origin);

	}

}