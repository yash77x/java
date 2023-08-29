package com.xworkz.validateandsave.repository;

import com.xworkz.validateandsave.dto.MovieDTO;

public interface MovieRepository {
	
	int TOTAL = 5;
	
	public void save(MovieDTO dto);
	
	public  MovieDTO findByMovieName(String name);

	public  MovieDTO findByMovieNameAndYear(String name, int year);

}
