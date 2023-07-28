package com.xworkz.equals.runner;

import com.xworkz.equals.app.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle("black", 450000, "Q7", "Audi", "Car");
		System.out.println(vehicle);
		
		System.out.println("------------------");
		
		Vehicle vehicle1 = new Vehicle("black", 450000, "Q7", "Audi", "Car");
		System.out.println(vehicle1);
		
		boolean result = vehicle.equals(vehicle1);
		System.out.println("Both are "+result);
	}

}
