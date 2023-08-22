package com.xworkz.validateandsave.repository;

import com.xworkz.validateandsave.dto.LabourDTO;

public class LabourRepoImpl implements LabourRepository {
	
	private LabourDTO[] dtos = new LabourDTO[TOTAL];
	int index = 0;

	@Override
	public void save(LabourDTO dto) {
		if (index < TOTAL) 
		{
			this.dtos[index] = dto;
			System.out.println("saved at " + index);
			index++;
		} 
		else {
			System.out.println("Storage is full");
		}
		
	}

}
