package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Satellite;

public class SatelliteRunner {

	public static void main(String[] args) {

		Satellite sat = new Satellite();
		System.out.println(sat);
		
		sat.setCountry("India");
		sat.setLaunchYear(2023);
		sat.setName("Chandrayaan");
		sat.setOperational(true);
		sat.setWeight(800);
		
		System.out.println("-------------------");
		System.out.println(sat);
	}

}
