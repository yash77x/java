package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {

		Grinder grin = new Grinder();
		System.out.println(grin);
		
		grin.setBrand("usha");
		grin.setHasTimer(true);
		grin.setMaterial("plastic");
		grin.setPrice(3000);
		grin.setRpm(300);
		
		System.out.println("-------------------");
		System.out.println(grin);
	}

}
