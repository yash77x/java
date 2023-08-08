package com.xworkz.diamondproblem.cooldrink;

public interface PepsiCoolDrink extends CoolDrink{

	@Override
	public default void cool() {
		System.out.println("invoking cool of pepsicooldrink");	
		
	}
	
	public default void energy() {
		System.out.println("invoking energy of pepsicooldrink");	

	}
	
																

}
