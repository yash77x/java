package com.xworkz.casting;

public class NikeShoe extends Shoes{
	String ceo;
	String brandAmbassadar;

	public NikeShoe(int price, Size size, Color color, String ceo, String brandAmbassadar) {
		super(price, size, color);
		this.ceo = ceo;
		this.brandAmbassadar = brandAmbassadar;
	}

	void printInfo() {
		System.out.println("Price = "+price);
		System.out.println("size = "+size);
		System.out.println("color = "+color);
		System.out.println("CEO = "+this.ceo);
		System.out.println("brandAmbassadar = "+this.brandAmbassadar);
	}

}