package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Dosa;

public class DosaRunner {

	public static void main(String[] args) {

		Dosa dosa = new Dosa();
		System.out.println(dosa);
		
		dosa.setChutney(true);
		dosa.setFilling("onion");
		dosa.setHotel("xworkz");
		dosa.setPrice(40);
		dosa.setType("masala");
		
		System.out.println("-------------------");
		System.out.println(dosa);
	}

}
