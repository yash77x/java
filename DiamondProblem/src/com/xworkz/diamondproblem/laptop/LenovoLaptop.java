package com.xworkz.diamondproblem.laptop;

public interface LenovoLaptop extends Laptop{

	void getbattery();
	
	@Override
	default void getProcessor() {
		System.out.println("Invoking processor in Lenovo laptop");
		
	}
}
