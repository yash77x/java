package com.xworkz.validateandsave.repository;

import com.xworkz.validateandsave.dto.LabourDTO;

public interface LabourRepository {
	
	int TOTAL = 5;
	
	public void save(LabourDTO dto);

}
