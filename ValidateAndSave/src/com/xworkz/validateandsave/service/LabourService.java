package com.xworkz.validateandsave.service;

import com.xworkz.validateandsave.dto.LabourDTO;

public interface LabourService {
	
	public boolean validateAndSave(LabourDTO dto);
	
	public LabourDTO findByName(String name);
	
	public LabourDTO findByNameAndAge(String name, int age);

}
