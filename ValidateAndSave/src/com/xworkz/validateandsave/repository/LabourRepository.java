package com.xworkz.validateandsave.repository;

import com.xworkz.validateandsave.dto.LabourDTO;

public interface LabourRepository {
	
	int TOTAL = 5;
	
	public void save(LabourDTO dto);
	
	public LabourDTO findByName(String name);
	
	public LabourDTO findByNameAndAge(String name, int age);

}
