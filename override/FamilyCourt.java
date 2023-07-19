package com.xworkz.override;

public class FamilyCourt extends CivilCourt {
	
	void divorceCase() {
		System.out.println("Invoking divorceCase of FamilyCourt..");
	}
	
	@Override
	void propertyCase() {
		System.out.println("Invoking propertyCase of CivilCourt..");
	}
	
	@Override
	void theftCase() {
		System.out.println("Invoking theftCase of CivilCourt..");
	}

}
