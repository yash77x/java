package com.xworkz.validateandsave.repository;

import com.xworkz.validateandsave.dto.MovieDTO;

public interface MovieRepository {
	
	int TOTAL = 5;
	
	public void save(MovieDTO dto);

}
