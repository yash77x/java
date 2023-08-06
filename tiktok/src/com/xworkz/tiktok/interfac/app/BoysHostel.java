package com.xworkz.tiktok.interfac.app;

public class BoysHostel implements HostelRule {

	@Override
	public void getFee() {
		System.out.println("Hostel Fee should be payed before Due date");
		
	}

	@Override
	public void lightsOff() {
		System.out.println("Hostel lights should be off at night");
		
	}

}
