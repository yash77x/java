package com.xworkz.tiktok.interfac.app;

public class HairSaloon implements SaloonRule {

	@Override
	public void waitForYourTurn() {
		System.out.println("Wait for your turn to get Hair cut");
		
	}

	@Override
	public void timings() {
		System.out.println("Timings are present");
		
	}

}
