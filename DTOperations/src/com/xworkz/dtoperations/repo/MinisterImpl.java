package com.xworkz.dtoperations.repo;

import com.xworkz.dtoperations.dto.MinisterDTO;

public class MinisterImpl implements Minister {

	@Override
	public void saveAndVali(MinisterDTO dto) {
		
		if(dto!=null) {
			 String name = dto.getName();
			 int exp = dto.getExp();
			 String designation = dto.getDesignation();
			 String partyName = dto.getPartyName();
			
			 if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<20) 
			 {
				System.out.println("Name " + name);
			 }
			 else {
				System.out.println("Name " + name + " is not valid");
			 }
			 
			 if(exp>0 && exp<30)
			 {
				 System.out.println("Exp " + exp);
			 }
			 else 
			 {
				 System.out.println("Exp " + exp + " is not valid" );
			 }
			 
			 if(designation!=null && !designation.isEmpty() && designation.length()>1 && designation.length()<20) 
			 {
				System.out.println("Designation " + designation);
			 }
			 else 
			 {
				System.out.println("Designation " + designation + " is not valid");
			 }
			 
			 if(partyName!=null && !partyName.isEmpty() && partyName.length()>1 && partyName.length()<100) 
			 {
				System.out.println("Party Name " + partyName);
			 }
			 else 
			 {
					System.out.println("Party Name " + partyName + "is not valid");
			 }
		}
		else {
			System.out.println("null");
		}
		
	}

}
