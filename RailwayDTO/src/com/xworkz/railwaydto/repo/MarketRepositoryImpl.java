package com.xworkz.railwaydto.repo;

import com.xworkz.railwaydto.dto.MarketDTO;

public class MarketRepositoryImpl implements MarketRepository {

	private MarketDTO[] marketDTOs = new MarketDTO[TOTAL];
	private int index = 0;

	@Override
	public void save(MarketDTO marketDTOs) {
		if (index < TOTAL) 
		{
			this.marketDTOs[index] = marketDTOs;
			System.out.println("saved at " + index);
			index++;
		} 
		else {
			System.out.println("Storage is full");
		}
	}

	@Override
	public MarketDTO findByArea(String area) {
		for (int i = 0; i < index; i++) 
		{
			if (marketDTOs[i].getArea() == area) 
			{
				System.out.println("area found");
				return marketDTOs[i];
			} 
			else {
				System.out.println("area not found, checking next");
			}
		}
		return null;
	}

	@Override
	public MarketDTO findByOwner(String owner) {
		for (int i = 0; i < index; i++) 
		{
			if (marketDTOs[i].getowner() == owner) 
			{
				System.out.println("owner found");
				return marketDTOs[i];
			} 
			else {
				System.out.println("owner not found, checking next");
			}
		}
		return null;
	}

	@Override
	public MarketDTO[] readAll() {
		return marketDTOs;
	}

}
