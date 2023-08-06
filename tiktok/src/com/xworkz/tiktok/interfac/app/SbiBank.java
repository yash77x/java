package com.xworkz.tiktok.interfac.app;

public class SbiBank implements BankRule {
	
	@Override
	public void getPassbook() {
		System.out.println("Bring Passbook");		
	}
	
	@Override
	public void getWait() {
		System.out.println("Wait till lunch break");		
	}
}
