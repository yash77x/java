package com.xworkz.casting;

public class Shoes {
	int price;
	Size size;
	Color color; 
	
	public Shoes(int price, Size size, Color color) {
		this.price = price;
		this.size = size;
		this.color = color;
	}
}

enum Size{
	SMALL, MEDIUM, LARGE;
	}

enum Color{
	BLACK, BLUE, WHITE;
}