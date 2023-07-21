package com.xworkz.methodchaining;

public class FarmChicken extends Chicken {
	int noOfDays;
	String careTaker;
	
	
	public FarmChicken(int price, String location, int noOfDays, String careTaker) {
		super(price, location);
		this.noOfDays = noOfDays;
		this.careTaker = careTaker;
	}
	
	@Override
	void printInfo()
	{
		System.out.println("Running printInfo in Farm Chicken");
		super.printInfo();
		System.out.println(this.noOfDays);
		System.out.println(this.careTaker);

	}

}
