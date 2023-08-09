package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.washingmachine.SamsungWashingMachine;
import com.xworkz.abstraction.app.washingmachine.Washing;
import com.xworkz.abstraction.app.washingmachine.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {

		WashingMachine machine = new SamsungWashingMachine();
		
		Washing washing = new Washing(machine);
		washing.geWash();

	}

}
