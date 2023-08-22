package com.xworkz.validateandsave.runner;

import com.xworkz.validateandsave.dto.LabourDTO;
import com.xworkz.validateandsave.service.LabourService;
import com.xworkz.validateandsave.service.LabourServiceImpl;

public class LabourRunner {

	public static void main(String[] args) {
		LabourDTO dto = new LabourDTO("Abhishek", 26, "trainer", 20000);
		
		LabourService service = new LabourServiceImpl();
		boolean ser = service.validateAndSave(dto);
		if(ser) {
			System.out.println("Saved "+ ser);
		}
		else {
			System.err.println("Saved "+ ser);
		}
	}

}
