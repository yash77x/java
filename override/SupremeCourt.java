package com.xworkz.override;

public class SupremeCourt extends Court {

	void importantCase() {
		System.out.println("Invoking importantCase of SuperCourt..");
	}
	
	@Override
	void justice() {
		System.out.println("Overriding Justice of Court..");
	}
}
