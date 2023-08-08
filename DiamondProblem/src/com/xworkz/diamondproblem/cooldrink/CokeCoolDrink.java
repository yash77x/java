package com.xworkz.diamondproblem.cooldrink;

public interface CokeCoolDrink extends CoolDrink{
	
@Override
public default void cool() {
	System.out.println("invoking cool of cokecooldrink");	
}

public default void stamina() {
	System.out.println("invoking stamina of cokecooldrink");	

}

}
