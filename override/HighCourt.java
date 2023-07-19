package com.xworkz.override;

public class HighCourt extends SupremeCourt {
	
	void criminalCase() {
		System.out.println("Invoking criminalCase of HighCourt..");
	}
	
	void forgeryCase() {
		System.out.println("Invoking forgeryCase of HighCourt..");
	}
	
	@Override
	void justice() {
		System.out.println("Overriding Justice of SupremeCourt..");
	}
	
}
