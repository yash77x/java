package com.xworkz.equals.runner;

import com.xworkz.equals.app.Assets;

public class AssetsRunner {

	public static void main(String[] args) {

		Assets assets = new Assets("Omkar", 200000, "Land");
		System.out.println(assets);
		
		System.out.println("--------------------");
		
		Assets assets1 = new Assets("Omkar", 200000, "Land");
		System.out.println(assets1);
		
		boolean result = assets.equals(assets1);
		System.out.println("Both are "+result);

	}

}
