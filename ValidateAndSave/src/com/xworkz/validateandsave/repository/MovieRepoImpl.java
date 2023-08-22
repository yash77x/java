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

}
