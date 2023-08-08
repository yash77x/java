package com.xworkz.diamondproblem.laptop;

public class GamingLaptop implements DellLaptop, LenovoLaptop{

	@Override
	public void getbattery() {
		System.out.println("Invoking battery in Gaming laptop");
		
	}

	@Override
	public void getOS() {
		System.out.println("Invoking OS in Gaming laptop");
		
	}
	
	@Override
	public void getMemory() {
		System.out.println("Invoking memory in Gaming laptop");
	}

	@Override
	public void getProcessor() {
		DellLaptop.super.getProcessor();
		LenovoLaptop.super.getProcessor();
	}

}
