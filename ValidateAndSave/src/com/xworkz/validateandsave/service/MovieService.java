package com.xworkz.validateandsave.service;

import com.xworkz.validateandsave.dto.MovieDTO;

public interface MovieService {
	
	public boolean validateAndSave(MovieDTO dto);

}
