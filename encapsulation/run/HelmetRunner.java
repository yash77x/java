package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {

		Helmet hel = new Helmet();
		System.out.println(hel);
		
		hel.setApproved(true);
		hel.setBrand("TVS");
		hel.setColor("blue");
		hel.setModelYear(2019);
		hel.setSize("medium");
		
		System.out.println("-------------------");
		System.out.println(hel);
	}

}
