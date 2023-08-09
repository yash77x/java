package com.xworkz.abstraction.app.printingmachine;

public class Print {
	
	private PrintingMachine machine;
	
	public Print(PrintingMachine machine) {
		this.machine = machine;
	}

	
	public void getPrint() {
		if(machine!=null) {
			System.out.println("Machine is not null");
			this.machine.print();
		}
		else {
			System.out.println("machine is null");
		}
	}

}
