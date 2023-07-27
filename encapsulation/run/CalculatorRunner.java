package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Calculator;

public class CalculatorRunner {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		System.out.println(cal);
		
		cal.setBrand("Casio");
		cal.setType("normal");
		cal.setPrice(400);
		cal.setWeight(50);
		cal.setColor("grey");
		
		System.out.println("-------------------");
		System.out.println(cal);
		
	}

}
