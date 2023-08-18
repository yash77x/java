package com.xworkz.railwaydto.repo;

import com.xworkz.railwaydto.dto.MarketDTO;

public interface MarketRepository {

	int TOTAL = 5;

	public void save(MarketDTO marketDTO);

	public MarketDTO findByArea(String area);

	public MarketDTO findByOwner(String owner);

	public MarketDTO[] readAll();

}
