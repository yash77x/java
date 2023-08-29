package com.xworkz.validateandsave.service;

import com.xworkz.validateandsave.dto.PlayerDTO;

public interface PlayerService {
	
	public boolean validateAndSave(PlayerDTO dto);
	
	public PlayerDTO findByName(String name);
	
	public PlayerDTO findByNameAndSport(String name, String sportName);

}
