package com.xworkz.validateandsave.runner;

import com.xworkz.validateandsave.dto.MovieDTO;
import com.xworkz.validateandsave.service.MovieService;
import com.xworkz.validateandsave.service.MovieServiceImpl;

public class MovieRunner {

	public static void main(String[] args) {
		MovieDTO dto = new MovieDTO("Oppenheimer", "Thriller", "Oscar", 2023);
		
		MovieService service = new MovieServiceImpl();
		boolean ser = service.validateAndSave(dto);
		if(ser) {
			System.out.println("Saved "+ser);
		}
		else {
			System.err.println("Saved "+ser);
		}
	}

}
