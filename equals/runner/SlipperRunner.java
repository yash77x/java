package com.xworkz.equals.runner;

import com.xworkz.equals.app.Slipper;

public class SlipperRunner {

	public static void main(String[] args) {
		
		Slipper slipper = new Slipper("Blue", "rubber", "Bata", 500, 9, "bata", true);
		System.out.println(slipper);
		
		System.out.println("--------------------");
		
		Slipper slipper1 = new Slipper("Blue", "rubber", "Bata", 500, 9, "bata", true);
		System.out.println(slipper1);
		
		boolean result = slipper.equals(slipper1);
		System.out.println("Both are "+result);

	}

}
