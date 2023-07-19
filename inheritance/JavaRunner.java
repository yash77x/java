package com.xworkz.inheritance;

public class JavaRunner {
	
	public static void main(String[] args) {
		
		IceCream ice = new IceCream(5, true, "chocolate");
		System.out.println(ice.isTasty);
		System.out.println(ice.name);
		System.out.println(ice.variety);
		
		System.out.println("-----------------------------");
		
		Food ice1 = new IceCream(2, false, "vanilla");
		System.out.println(ice1.isTasty);
		System.out.println(ice1.name);
		System.out.println(ice1.variety);
		
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		
		Xworkz ins = new Xworkz("xworkz", "BTM Layout", 5);
		System.out.println(ins.name);
		System.out.println(ins.location);
		System.out.println(ins.trainers);
		
		System.out.println("-----------------------------");
		
		Institute ins1 = new Xworkz("kodnest", "BTM Layout", 20);
		System.out.println(ins1.name);
		System.out.println(ins1.location);
		System.out.println(ins1.trainers);
		
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		
		Home home = new Home("Hubli", 3, false);
		System.out.println(home.location);
		System.out.println(home.noOfDoors);
		System.out.println(home.onSale);

		System.out.println("-----------------------------");

		Building home1 = new Home("Dharwad", 5, true);
		System.out.println(home1.location);
		System.out.println(home1.noOfDoors);
		System.out.println(home1.onSale);
		
		System.out.println("-----------------------------");

		Animal mon = new Monkey("Monkey", 40, "African");
		System.out.println(mon.name);
		System.out.println(mon.weight);
		System.out.println(mon.breed);



	}

}