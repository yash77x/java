package com.xworkz.abstraction.app.washingmachine;

public class Washing {

	private WashingMachine machine;
	
	public Washing(WashingMachine machine) {
	this.machine = machine;
	}
	
	public void geWash() {
		if(machine!= null) {
			System.out.println("Machine is not null");
			this.machine.wash();
		}
		else {
			System.err.println("machine is null");
		}
	}
}
