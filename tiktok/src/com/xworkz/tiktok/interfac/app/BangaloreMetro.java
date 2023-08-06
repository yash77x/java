package com.xworkz.tiktok.interfac.app;

public class BangaloreMetro implements MetroRule {
	
	@Override
	public void getTicket() {
		System.out.println("Ticket Should be Taken");
	}

	@Override
	public void getPlatform() {
		System.out.println("Should wait at platform");
	}

}
