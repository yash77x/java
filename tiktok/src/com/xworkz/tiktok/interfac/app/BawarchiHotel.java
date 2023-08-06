package com.xworkz.tiktok.interfac.app;

public class BawarchiHotel implements HotelRule {

	@Override
	public void timings() {
		System.out.println("Timings apply");
		
	}

	@Override
	public void payBill() {
		System.out.println("Should Pay the Bill");
		
	}

}
