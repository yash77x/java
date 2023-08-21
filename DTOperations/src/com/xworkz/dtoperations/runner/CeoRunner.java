package com.xworkz.dtoperations.runner;

import com.xworkz.dtoperations.dto.CeoDTO;
import com.xworkz.dtoperations.repo.CeoImpl;

public class CeoRunner {
	
	public static void main(String[] args) {
		
		CeoDTO dto = new CeoDTO("Omkar", "xworkz", 900000,10);		
		CeoImpl ceo = new CeoImpl();
		ceo.saveAndVali(dto);
	}

}
