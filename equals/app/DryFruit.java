package com.xworkz.equals.app;

public class DryFruit {
	
	private int price;
	private int quantity;
	private String dryFruitName;
	private String shopName;
	private String expiryDate;
	
	public DryFruit(int price, int quantity, String dryFruitName, String shopName, String expiryDate) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.dryFruitName = dryFruitName;
		this.shopName = shopName;
		this.expiryDate = expiryDate;
	}
	
	@Override
	public String toString() {
		return "Shop Name=" + shopName + "\n" + "dry fruit name=" + dryFruitName + "\n" + "Quantity=" + quantity + "\n" + "Price=" + price + "\n" + "Expiry=" + expiryDate;	

	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null)
		{
			System.out.println("Object is not null, can proceed further");
			if(obj instanceof DryFruit) {
				DryFruit casted = (DryFruit) obj;
				if(this.shopName == casted.shopName && this.dryFruitName == casted.dryFruitName && this.quantity == casted.quantity && this.price == casted.price&& this.expiryDate == casted.expiryDate)
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
