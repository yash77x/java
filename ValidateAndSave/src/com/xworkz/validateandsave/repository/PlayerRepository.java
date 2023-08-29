package com.xworkz.validateandsave.repository;

import com.xworkz.validateandsave.dto.PlayerDTO;

public interface PlayerRepository {
	
	int TOTAL = 5;
	
	public void save(PlayerDTO dto);
	
	public PlayerDTO findByName(String name);
	
	public PlayerDTO findByNameAndSport(String name, String sportName);

}
