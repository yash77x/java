package com.xworkz.override;

public class CourtRunner {

	public static void main(String[] args) {
		Court court = new Court();
		System.out.println("Court");
		court.justice();
		
		System.out.println("---------------------------");
		
		SupremeCourt supreme = new SupremeCourt();
		System.out.println("Supreme Court");
		supreme.importantCase();
		supreme.justice();
		
		System.out.println("---------------------------");
		
		HighCourt high = new HighCourt();
		System.out.println("High Court");
		high.criminalCase();
		high.forgeryCase();
		high.justice();
		
		System.out.println("---------------------------");

		CivilCourt civil = new CivilCourt();
		System.out.println("Civil Court");
		civil.propertyCase();
		civil.theftCase();
		civil.criminalCase();
		civil.forgeryCase();
		
		System.out.println("---------------------------");

		FamilyCourt family = new FamilyCourt();
		System.out.println("Family Court");
		family.divorceCase();
		family.propertyCase();
		family.theftCase();
	}

}
