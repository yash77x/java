package com.xworkz.dtoperations.repo;

import com.xworkz.dtoperations.dto.CeoDTO;

public class CeoImpl implements Ceo {

	@Override
	public void saveAndVali(CeoDTO dto) {
		if(dto!=null) {
			String name = dto.getName();
			String companyName = dto.getCompanyName();
			double salary = dto.getSalary();
			int exp = dto.getExp();
			
			if(name!=null && !name.isEmpty() && name.length() > 3 && name.length() <20) 
			{
				System.out.println("Name " + name);
			}
			else {
				System.out.println("Name " + name + " is not valid");
			}
			
			
			if(companyName!=null && !companyName.isEmpty() && companyName.length() > 3 && companyName.length() <20) 
			{
				System.out.println("Company " + companyName);
			}
			else {
				System.out.println("Company " + companyName + " is not valid");
			}
			
			if(salary>0 && salary<1000000) 
			{
				System.out.println("Salary " + salary);
			}
			else {
				System.out.println("Salary " + salary + " is not valid");
			}
			
			 if(exp>0 && exp<30)
			 {
				 System.out.println("Exp " + exp);
			 }
			 else 
			 {
				 System.out.println("Exp " + exp + " is not valid" );
			 }

		}
		else {
			System.out.println("null");
		}
	}

}
