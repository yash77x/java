package com.xworkz.diamondproblem.rice;

public interface BiryaniRice extends Rice{
	
	void chicken();
	
	@Override
	default void spicy() {
		System.out.println("invoking biryanirice");
	}

}
