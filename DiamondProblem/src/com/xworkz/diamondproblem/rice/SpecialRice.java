package com.xworkz.diamondproblem.rice;

public class SpecialRice implements EggRice,BiryaniRice {

	@Override
	public void tasty() {
		System.out.println("invoking rice specialrice");
		
	}

	@Override
	public void chicken() {
		System.out.println("invoking biryani specialrice");
		
	}

	@Override
	public void egg() {
		System.out.println("invoking egg specialrice");
		
	}

	@Override
	public void spicy() {
		BiryaniRice.super.spicy();
		EggRice.super.spicy();
	}
	

}
