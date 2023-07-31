package com.xworkz.casting;

public class Puma extends Shoes {
	String origin;
	String model;
	
	public Puma(String color, int price, String origin, String model) {
		super(color, price);
		this.origin = origin;
		this.model = model;
	}
	
	@Override
	void print() {
		super.print();
		System.out.println(this.origin);
		System.out.println(this.model);
	}
}
