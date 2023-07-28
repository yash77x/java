package com.xworkz.equals.runner;

import com.xworkz.equals.app.DryFruit;

public class DryFruitRunner {

	public static void main(String[] args) {

		DryFruit dryFruit = new DryFruit(500, 200, "Badam", "xworkz", "aug-2023");
		System.out.println(dryFruit);
		
		System.out.println("-------------------");
		
		DryFruit dryFruit1 = new DryFruit(500, 200, "Badam", "xworkz", "aug-2023");
		System.out.println(dryFruit1);
		
		
		boolean result = dryFruit.equals(dryFruit1);
		System.out.println("Both are "+result);
	}

}
