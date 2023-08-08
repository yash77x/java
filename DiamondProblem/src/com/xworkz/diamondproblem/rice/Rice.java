package com.xworkz.diamondproblem.rice;

public interface Rice {
	
	public void tasty();
	
	public default void spicy() {
		System.out.println(" invoking Rice is spicy");
	}

}
