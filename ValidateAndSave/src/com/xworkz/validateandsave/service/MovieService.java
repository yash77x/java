package com.xworkz.validateandsave.service;

import com.xworkz.validateandsave.dto.MovieDTO;

public interface MovieService {
	
	public boolean validateAndSave(MovieDTO dto);
	
	public  MovieDTO findByMovieName(String name);

	public  MovieDTO findByMovieNameAndYear(String name, int year);

}
