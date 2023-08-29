package com.xworkz.validateandsave.service;

import com.xworkz.validateandsave.dto.PlayerDTO;
import com.xworkz.validateandsave.repository.PlayerRepository;
import com.xworkz.validateandsave.util.Validation;

public class PlayerServiceImpl implements PlayerService {

	private PlayerRepository playerRepository;

	public PlayerServiceImpl(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	@Override
	public boolean validateAndSave(PlayerDTO dto) {

		if (dto != null) {
			String name = dto.getName();
			String sport = dto.getSportName();

			if (Validation.stringValidate(name)) {
				System.out.println("Name " + name);
			} else {
				System.err.println("Name " + name + " is invalid");
				return false;
			}

			if (Validation.stringValidate(sport)) {
				System.out.println("Sport " + sport);
			} else {
				System.err.println("Sport " + sport + " is invalid");
				return false;
			}

			playerRepository.save(dto);
			return true;

		}
		return false;
	}

	@Override
	public PlayerDTO findByName(String name) {
		if(Validation.stringValidate(name)) {
			return playerRepository.findByName(name);
		}
		System.err.println("Data is not valid");
		return null;
	}

	@Override
	public PlayerDTO findByNameAndSport(String name, String sportName) {
		if(Validation.stringValidate(name) && Validation.stringValidate(sportName)) {
			return playerRepository.findByNameAndSport(name, sportName);
		}
		System.err.println("Data is not valid");
		return null;
	}

}
