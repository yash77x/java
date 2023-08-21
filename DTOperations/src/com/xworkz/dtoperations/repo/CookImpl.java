package com.xworkz.dtoperations.repo;

import com.xworkz.dtoperations.dto.CookDTO;

public class CookImpl implements Cook {

	@Override
	public void saveAndVali(CookDTO dto) {
		if(dto!=null) {
			String specialItem = dto.getSpecialItem();
			String hotelName = dto.getHotelName();
			String gender = dto.getGender();
			double salary = dto.getSalary();
		
			if(specialItem!=null && !specialItem.isEmpty() && specialItem.length()>3 && specialItem.length()<20)
			{
				System.out.println("Special " + specialItem);
			}
			else {
				System.out.println("Special " + specialItem + " is not valid");
			}
			
			if(hotelName!=null && !hotelName.isEmpty() && hotelName.length()>3 && hotelName.length()<20) 
			{
				System.out.println("Hotel " + hotelName);
			}
			else {
				System.out.println("Hotel " + hotelName + " is not valid");
			}
			
			if(gender!=null && !gender.isEmpty() && gender.length()>3 && gender.length()<20) {
				System.out.println("Gender " + gender);
			}
			else {
				System.err.println("Gender " + gender+ " is not valid");
			}
			
			if(salary>0 && salary<1000000) 
			{
				System.out.println("Salary " + salary);
			}
			else {
				System.out.println("Salary " + salary + " is not valid");
			}
		
		}
		else {
			System.out.println("null");
		}
		
	}

}
