package com.xworkz.methodchaining;

public class BroilerChicken extends Chicken {
	boolean isAlive;
	float weight;

	public BroilerChicken(int price, String location, boolean isAlive, float weight) {
		super(price, location);
		this.isAlive = isAlive;
		this.weight = weight;
	}
	
	@Override
	void printInfo()
	{
		System.out.println("Running printInfo in Broiler Chicken");
		super.printInfo();
		System.out.println(this.isAlive);
		System.out.println(this.weight);

	}

}
