package com.xworkz.validateandsave.service;

import com.xworkz.validateandsave.dto.LabourDTO;
import com.xworkz.validateandsave.dto.MovieDTO;
import com.xworkz.validateandsave.repository.LabourRepoImpl;
import com.xworkz.validateandsave.repository.LabourRepository;
import com.xworkz.validateandsave.util.Validation;

public class LabourServiceImpl implements LabourService {
	LabourRepository repository = new LabourRepoImpl();

	@Override
	public boolean validateAndSave(LabourDTO dto) {
		if (dto != null) {
			String name = dto.getName();
			int age = dto.getAge();
			String occupation = dto.getOccupation();
			int income = dto.getIncome();

			if (Validation.stringValidate(name)) {
				System.out.println("Name " + name);
			} else {
				System.err.println("Name " + name + " is not valid");
				return false;
			}

			if (age > 0 && age < 100) {
				System.out.println("Age " + age);
			} else {
				System.err.println("Age " + age + " is not valid");
				return false;
			}

			if (Validation.stringValidate(occupation)) {
				System.out.println("Occupation " + occupation);
			} else {
				System.err.println("Occupation " + occupation + " is not valid");
				return false;
			}

			if (income > 0 && income < 1000000) {
				System.out.println("income " + income);
			} else {
				System.err.println("income " + income + " is not valid");
				return false;
			}
			
			repository.save(dto);
			return true;
			
		} else {
			System.err.println("null");
		}
		return false;
	}

	@Override
	public LabourDTO findByName(String name) {
		if(Validation.stringValidate(name)) {
			LabourDTO found = repository.findByName(name);
			return found;
		}
		System.err.println("Data is not valid");
		return null;
		}

	@Override
	public LabourDTO findByNameAndAge(String name, int age) {
		if(Validation.stringValidate(name) && age > 0 && age < 100) {
			LabourDTO found1 = repository.findByNameAndAge(name, age);
			return found1;
		}
		System.err.println("Data is not valid");
		return null;
	}

}
