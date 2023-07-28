package com.xworkz.equals.runner;

import com.xworkz.equals.app.Grocery;

public class GroceryRunner {
//140088
	public static void main(String[] args) {
		Grocery gro = new Grocery(200,"Reliance");
		System.out.println(gro);
		
		System.out.println("--------------------");
		
		Grocery gro1 = new Grocery(200,"Reliance");
		System.out.println(gro1);
		
		boolean result = gro.equals(gro1);
		System.out.println("Both are "+result);
		

	}

}
