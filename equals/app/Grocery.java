package com.xworkz.equals.app;

public class Grocery {
	
	private int price;
	private String shopName;
	
	
	
	public Grocery(int price, String shopName) {
		
		this.price = price;
		this.shopName = shopName;
	}

	@Override
	public String toString() {
		return "Shop Name=" + shopName + "\n" + "price=" + price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null)
		{
			System.out.println("Object is not null, can proceed further");
			if(obj instanceof Grocery) {
				Grocery casted = (Grocery) obj;
				if(this.price == casted.price && this.shopName == casted.shopName)
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
