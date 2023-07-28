package com.xworkz.equals.runner;

import com.xworkz.equals.app.Gold;

public class GoldRunner {

	public static void main(String[] args) {

		Gold gold = new Gold("Kalyan", 24.0d, 12.4d, 60000);
		System.out.println(gold);
		
		System.out.println("--------------------");
		
		Gold gold1 = new Gold("Kalyan", 24.0d, 12.4d, 60000);
		System.out.println(gold1);
		
		boolean result = gold.equals(gold1);
		System.out.println("Both are "+result);
	}

}
