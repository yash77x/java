package com.xworkz.diamondproblem.rice;

public interface EggRice extends Rice {
	
	void egg();
	
	@Override
	default void spicy() {
		System.out.println("invoking eggrice");
	}

}
