package com.xworkz.abstraction.app.elevator;

public class People {

	private Elevator elevator;

	public People(Elevator elevator) {
		this.elevator = elevator;
	}

	public void getCarryLuggage() {
		if (elevator != null) {

			System.out.println("elevator is not null");
			this.elevator.carryLuggage();
		}
		else {
			System.out.println("elevator is null");
		}
	}

}
