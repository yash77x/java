package com.xworkz.validateandsave.runner;

import com.xworkz.validateandsave.dto.LabourDTO;
import com.xworkz.validateandsave.service.LabourService;
import com.xworkz.validateandsave.service.LabourServiceImpl;

public class LabourRunner {

	public static void main(String[] args) {
		LabourDTO dto = new LabourDTO("Abhishek", 26, "trainer", 20000);
		LabourDTO dto1 = new LabourDTO("Omkar", 35, "trainer", 500000);

		
		LabourService service = new LabourServiceImpl();
		
		boolean ser = service.validateAndSave(dto);
		if(ser) {
			System.out.println("Saved "+ ser);
		}
		else {
			System.err.println("Saved "+ ser);
		}
		
		boolean ser1 = service.validateAndSave(dto1);
		if(ser1) {
			System.out.println("Saved "+ ser1);
		}
		else {
			System.err.println("Saved "+ ser1);
		}
		
		service.findByName("Omkar");
		service.findByNameAndAge("Abhishek", 26);
	}

}
