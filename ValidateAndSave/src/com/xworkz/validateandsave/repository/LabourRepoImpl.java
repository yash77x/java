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

	@Override
	public LabourDTO findByName(String name) {
		for(int i=0; i<index; i++) {
			if(dtos[i].getName().equalsIgnoreCase(name)) {
				System.out.println("Labour found ");
				System.out.println(dtos[i]);
				return dtos[i];
			}
			System.out.println("Labour not found, checking another..");
		}
		System.err.println("Labour not found");
		return null;
	}

	@Override
	public LabourDTO findByNameAndAge(String name, int age) {
		for(int i=0; i<index; i++) {
			if(dtos[i].getName().equalsIgnoreCase(name) && dtos[i].getAge()==age) {
				System.out.println("Labour found ");
				System.out.println(dtos[i]);
				return dtos[i];
			}
			System.out.println("Labour not found, checking another..");
		}
		System.err.println("Labour not found");
		return null;
	}

}
