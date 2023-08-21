package com.xworkz.dtoperations.runner;

import com.xworkz.dtoperations.dto.MechanicDTO;
import com.xworkz.dtoperations.repo.MechanicImpl;

public class MechanicRunner {

	public static void main(String[] args) {

		MechanicDTO dto = new MechanicDTO("Xworkz", 4567654, "Bike", 5000);
		
		MechanicImpl Mechanic = new MechanicImpl();
		Mechanic.saveAndVali(dto);
	}

}
