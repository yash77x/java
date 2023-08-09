package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.printingmachine.CanonPrintingMachine;
import com.xworkz.abstraction.app.printingmachine.Print;

public class PrintingMachineRunner {

	public static void main(String[] args) {

		CanonPrintingMachine printingMachine = new CanonPrintingMachine();
		
		Print print = new Print(printingMachine);
		print.getPrint();
	}

}
