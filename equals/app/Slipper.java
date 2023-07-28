package com.xworkz.equals.app;

public class Slipper {
	
	private String color;
	private String material;
	private String brandName;
	private int price;
	private int size;
	private String shopName;
	private boolean quality;
	
	public Slipper(String color, String material, String brandName, int price, int size, String shopName,
			boolean quality) {
		
		this.color = color;
		this.material = material;
		this.brandName = brandName;
		this.price = price;
		this.size = size;
		this.shopName = shopName;
		this.quality = quality;
	}
	
	@Override
	public String toString() {
		return "Shop Name=" + shopName + "\n" + "Brand Name=" + brandName + "\n" + "Size=" + size + "\n" + "Price=" + price + "\n" + "Material=" + material + "\n" + "Color=" + color + "\n" + "Quality=" + quality;	

	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null)
		{
			System.out.println("Object is not null, can proceed further");
			if(obj instanceof Slipper) {
				Slipper casted = (Slipper) obj;
				if(this.shopName == casted.shopName && this.brandName == casted.brandName && this.size == casted.size && this.price == casted.price && this.material == casted.material && this.color == casted.color && this.quality == casted.quality)
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
