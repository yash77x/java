package com.xworkz.abstraction.app.kidney;

public class HumanKidney implements Kidney {

	@Override
	public void clean() {
		System.out.println("Invoking clean in Human Kidney");
	}

}