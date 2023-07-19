package com.xworkz.override;

public class CivilCourt extends HighCourt {

	void propertyCase() {
		System.out.println("Invoking propertyCase of CivilCourt..");
	}
	
	void theftCase() {
		System.out.println("Invoking theftCase of CivilCourt..");
	}
	
	@Override
	void criminalCase() {
		System.out.println("Invoking criminalCase of HighCourt..");
	}
	
	@Override
	void forgeryCase() {
		System.out.println("Invoking forgeryCase of HighCourt..");
	}
}
