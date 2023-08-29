package com.xworkz.validateandsave.service;

import com.xworkz.validateandsave.dto.MovieDTO;
import com.xworkz.validateandsave.repository.MovieRepoImpl;
import com.xworkz.validateandsave.repository.MovieRepository;
import com.xworkz.validateandsave.util.Validation;

public class MovieServiceImpl implements MovieService {
	MovieRepository repository = new MovieRepoImpl();


	@Override
	public boolean validateAndSave(MovieDTO dto) {
		if(dto!=null) {
			String name = dto.getMovieName();
			String genre = dto.getGenre();
			String awards = dto.getAwards();
			int year = dto.getYear();
			
			if(Validation.stringValidate(name)) {
				System.out.println("Name " + name);
			} else {
				System.err.println("Name " + name + " is not valid");
				return false;
			}
			
			if(Validation.stringValidate(genre)) {
				System.out.println("Genre " + genre);
			} else {
				System.err.println("Genre " + genre + " is not valid");
				return false;
			}
			
			if(Validation.stringValidate(awards)) {
				System.out.println("Awards " + awards);
			} else {
				System.err.println("Awards " + awards + " is not valid");
				return false;
			}
			
			if(year>=2000 && year<=2023) {
				System.out.println("Year " + year);
			} else {
				System.err.println("Year " + year + " is not valid");
				return false;
			}
			
			repository.save(dto);
			return true;
		}
		return false;
	}

	@Override
	public MovieDTO findByMovieName(String name) {
		if(Validation.stringValidate(name)) {
			MovieDTO found = repository.findByMovieName(name);
			return found;
		}
		System.err.println("Data is not valid");
		return null;
	}

	@Override
	public MovieDTO findByMovieNameAndYear(String name, int year) {
		if(Validation.stringValidate(name) && year>=2000 && year<=2023) {
			MovieDTO found1 = repository.findByMovieNameAndYear(name, year);
			return found1;
		}
		System.err.println("Data is not valid");
		return null;
	}

}
