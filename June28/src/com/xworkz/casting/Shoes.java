package com.xworkz.casting;

public class Shoes {
	
	String color;
	int price;
	
	public Shoes(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}
	
	void print() {
		System.out.println(color);
		System.out.println(price);
	}
}
