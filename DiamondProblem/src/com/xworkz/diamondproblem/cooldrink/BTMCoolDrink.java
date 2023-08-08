package com.xworkz.diamondproblem.cooldrink;

public class BTMCoolDrink implements CokeCoolDrink,PepsiCoolDrink{
	
	@Override
	public void cool() {
		System.out.println("invoking cool of BTMcooldrink");	
	}
	
	@Override
	public void energy() {
		System.out.println("invoking energy of BTMcooldrink");	

	}
	
	@Override
	public void stamina() {
		System.out.println("invoking stamina of BTMcooldrink");	

	}

}
