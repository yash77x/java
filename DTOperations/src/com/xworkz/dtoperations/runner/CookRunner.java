package com.xworkz.dtoperations.runner;

import com.xworkz.dtoperations.dto.CookDTO;
import com.xworkz.dtoperations.repo.CookImpl;

public class CookRunner {

	public static void main(String[] args) {
		
		CookDTO dto = new CookDTO("Pasta", "Sigdi", "Male", 600000);
		
		CookImpl cook = new CookImpl();
		cook.saveAndVali(dto);

	}

}
