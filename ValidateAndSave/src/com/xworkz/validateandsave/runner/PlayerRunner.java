package com.xworkz.validateandsave.runner;

import com.xworkz.validateandsave.dto.PlayerDTO;
import com.xworkz.validateandsave.repository.PlayerRepoImpl;
import com.xworkz.validateandsave.repository.PlayerRepository;
import com.xworkz.validateandsave.service.PlayerService;
import com.xworkz.validateandsave.service.PlayerServiceImpl;

public class PlayerRunner {

	public static void main(String[] args) {
		PlayerDTO dto = new PlayerDTO("Lionel Messi", "Football");
		PlayerDTO dto1 = new PlayerDTO("Rohit Sharma", "Cricket");
		
		PlayerRepository repository = new PlayerRepoImpl();
		
		PlayerService service = new PlayerServiceImpl(repository);
		
		boolean sav = service.validateAndSave(dto);
		if(sav) {
			System.out.println("Saved "+sav);
		}
		else {
			System.err.println("Saved "+sav);
		}
		
		boolean sav1 = service.validateAndSave(dto1);
		if(sav1) {
			System.out.println("Saved "+sav1);
		}
		else {
			System.err.println("Saved "+sav1);
		}
		
		service.findByName("rohit sharma");
		service.findByNameAndSport("Lionel Messi", "Football");
	}

}
