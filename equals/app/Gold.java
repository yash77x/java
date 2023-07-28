package com.xworkz.equals.app;

public class Gold {
	
	private String name;
	private double carrat;
	private double weight;
	private int price;
	
	public Gold(String name, double carrat, double weight, int price) {
		this.name = name;
		this.carrat = carrat;
		this.weight = weight;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Name=" + name + "\n" + "Carrat=" + carrat + "\n" + "Weight=" + weight + "\n" + "Price=" + price;	

	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null)
		{
			System.out.println("Object is not null, can proceed further");
			if(obj instanceof Gold) {
				Gold casted = (Gold) obj;
				if(this.name == casted.name && this.carrat == casted.carrat && this.weight == casted.weight && this.price == casted.price)
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
