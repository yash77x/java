package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Tap;

public class TapRunner {

	public static void main(String[] args) {

		Tap tap = new Tap();
		System.out.println(tap);
		
		tap.setBrand("Bosch");
		tap.setFlowRate(40);
		tap.setMaterial("steel");
		tap.setTouchless(true);
		tap.setWeight(40);
		
		System.out.println("-------------------");
		System.out.println(tap);
	}

}
