package com.xworkz.diamondproblem.laptop;

public interface DellLaptop extends Laptop{

	void getOS();
	
	@Override
	default void getProcessor() {
		System.out.println("Invoking processor in Dell laptop");
		
	}
}
