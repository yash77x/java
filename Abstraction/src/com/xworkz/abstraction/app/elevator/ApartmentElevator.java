package com.xworkz.abstraction.app.elevator;

public class ApartmentElevator implements Elevator{

	@Override
	public void carryLuggage() {

		System.out.println("Invoking carryLuggage in ApartmentElevator");
	}

}