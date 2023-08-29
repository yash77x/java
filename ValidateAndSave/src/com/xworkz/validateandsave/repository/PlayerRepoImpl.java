package com.xworkz.validateandsave.repository;

import com.xworkz.validateandsave.dto.PlayerDTO;

public class PlayerRepoImpl implements PlayerRepository {
	
	private PlayerDTO[] dtos = new PlayerDTO[TOTAL];
	private int index = 0;

	@Override
	public void save(PlayerDTO dto) {
		if(index < TOTAL) {
			this.dtos[index] = dto;
			System.out.println("Saved at "+ index);
			index++;
		}
		else {
			System.err.println("Storage is full");
		}

	}

	@Override
	public PlayerDTO findByName(String name) {
		for(int i=0; i<index; i++) {
			if(dtos[i].getName().equalsIgnoreCase(name)) {
				System.out.println("Player found at "+index);
				System.out.println(dtos[i]);
				return dtos[i];
			}
			System.out.println("Player not found, checking another..");
		}
		System.err.println("Player not found");
		return null;
	}

	@Override
	public PlayerDTO findByNameAndSport(String name, String sportName) {
		for(int i=0; i<index; i++) {
			if(dtos[i].getName().equalsIgnoreCase(name) && dtos[i].getSportName().equalsIgnoreCase(sportName)) {
				System.out.println("Player found at "+index);
				System.out.println(dtos[i]);
				return dtos[i];
			}
			System.out.println("Player not found, checking another..");
		}
		System.err.println("Player not found");
		return null;
	}

}
