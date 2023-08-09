package com.xworkz.abstraction.app.kidney;

public class Mahesh {
	private Kidney kidney;
	
	public Mahesh(Kidney kidney) {
		this.kidney = kidney;
	}

	public void check() {
		if(kidney!=null) {
			System.out.println("kidney is not null");
			this.kidney.clean();
		}
		else {
			System.out.println("Kidney is null");
		}
	}
}
