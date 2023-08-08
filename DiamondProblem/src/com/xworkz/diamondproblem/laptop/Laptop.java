package com.xworkz.diamondproblem.laptop;

public interface Laptop {
	void getProcessor();
	
	default void getMemory() {
		System.out.println("Invoking memory in laptop");
	}

}
