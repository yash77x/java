package com.xworkz.validateandsave.repository;

import com.xworkz.validateandsave.dto.MovieDTO;

public class MovieRepoImpl implements MovieRepository {
	
	private MovieDTO[] dtos = new MovieDTO[TOTAL];
	private int index = 0;

	@Override
	public void save(MovieDTO dto) {
		if(index < TOTAL) {
			this.dtos[index] = dto;
			System.out.println("saved at " + index);
			index++;
		}
		else {
			System.out.println("Storage is full");
		}
	}

	@Override
	public MovieDTO findByMovieName(String name) {
		for(int i=0; i<index; i++) {
			if(dtos[i].getMovieName().equalsIgnoreCase(name)) {
				System.out.println("Movie found ");
				System.out.println(dtos[i]);
				return dtos[i];
			}
			System.out.println("Movie not found, checking another..");
		}
		System.err.println("Movie not found");
		return null;
	}

	@Override
	public MovieDTO findByMovieNameAndYear(String name, int year) {
		for(int i=0; i<index; i++) {
			if(dtos[i].getMovieName().equalsIgnoreCase(name) && dtos[i].getYear()==year) {
				System.out.println("Movie found ");
				System.out.println(dtos[i]);
				return dtos[i];
			}
			System.out.println("Movie not found, checking another..");
		}
		System.err.println("Movie not found");
		return null;
	}

}
