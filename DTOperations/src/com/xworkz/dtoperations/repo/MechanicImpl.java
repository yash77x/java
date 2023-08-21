package com.xworkz.dtoperations.repo;

import com.xworkz.dtoperations.dto.MechanicDTO;

public class MechanicImpl implements Mechanic {

	@Override
	public void saveAndVali(MechanicDTO dto) {

		if(dto!=null) {
			 String garageName = dto.getGarageName();
			 int gstNumber = dto.getGstNumber();
			 String specialization = dto.getSpecialization();
			 int bikeServiceCost = dto.getBikeServiceCost();
			 
			 if(garageName!=null && !garageName.isEmpty() && garageName.length()>3 && garageName.length()<30) 
			 {
				System.out.println("Garage " + garageName);
			 }
			 else {
				System.out.println("Garage " + garageName + "is not valid");
			 }
			 
			 if(gstNumber>0) {
				 System.out.println("GST No. " + gstNumber);
			 }
			 else {
				 System.out.println("GST No. " + gstNumber + "is not valid");
			 }
			 
			 if(specialization!=null && !specialization.isEmpty() && specialization.length()>3 && specialization.length()<30) 
			 {
				System.out.println("Specialization " + specialization);
			 }
			 else {
					System.out.println("Specialization " + specialization + "is not valid");
			 }
			 
			 if(bikeServiceCost>0 && bikeServiceCost<20000)
			 {
				System.out.println("Bike service cost " + bikeServiceCost);
			 }
			 else {
				System.out.println("Bike service cost " + bikeServiceCost + " is not valid");
			 }

		}
		else {
			System.err.println("null");
		}
	}

}
