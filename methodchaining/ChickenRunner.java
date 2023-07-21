package com.xworkz.methodchaining;

public class ChickenRunner {

	public static void main(String[] args) {

		Chicken chic = new Chicken(400, "Bangalore");
		chic.printInfo();
		
		Chicken chic1 = new BroilerChicken(300, "Hubli", true, 1.2f);
		chic1.printInfo();
		
		Chicken chic2 = new FarmChicken(200, "Gadag", 15, "Rajeshwari");
		chic2.printInfo();
	}

}
