package com.xworkz.casting;

public class Nike extends Shoes {
	
	String ceo;
	boolean isOriginal;
	
	public Nike(String color, int price, String ceo, boolean isOriginal) {
		super(color, price);
		this.ceo = ceo;
		this.isOriginal = isOriginal;
	}
	
	@Override
	void print() {
		super.print();
		System.out.println(this.ceo);
		System.out.println(this.isOriginal);
	}
}
