package com.xworkz.abstraction.app.washingmachine;

public class SamsungWashingMachine implements WashingMachine {

	@Override
	public void wash() {
		System.out.println("Invoking wash of SamsungWashingMachine");
	}

}
