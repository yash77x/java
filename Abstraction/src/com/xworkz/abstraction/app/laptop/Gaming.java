package com.xworkz.abstraction.app.laptop;

public class Gaming {

	private Laptop laptop;
	 
	public Gaming( Laptop laptop) {
		this.laptop = laptop;
	}

	public void getDisplay() {
		if(laptop!=null) {
			System.out.println("Laptop is not null");
			this.laptop.display();
			
		}
		else {
			System.out.println("laptop is null");
		}
	}
}
