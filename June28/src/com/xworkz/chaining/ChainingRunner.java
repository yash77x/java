package com.xworkz.chaining;

public class ChainingRunner {
	public static void main(String[] args) {
		
		Building building = new Building("Bangalore", 4);
		building.print();
		
		System.out.println("--------------");

		Institute institute = new Institute("Bangalore", 5, "xworkz", "Institute");
		institute.print();
		
		System.out.println("--------------");

		Company company = new Company("Hubli", 7, "Infosys", "IT Company");
		company.print();
	}

}
