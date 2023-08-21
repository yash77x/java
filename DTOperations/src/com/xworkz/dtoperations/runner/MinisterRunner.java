package com.xworkz.dtoperations.runner;

import com.xworkz.dtoperations.dto.MinisterDTO;
import com.xworkz.dtoperations.repo.MinisterImpl;

public class MinisterRunner {
	
	public static void main(String[] args) {
		
		MinisterDTO dto = new MinisterDTO("Siddharamaih", 20, "Chief Minister", "BJP");
		
		MinisterImpl minister = new MinisterImpl();
		minister.saveAndVali(dto);
	}

}
