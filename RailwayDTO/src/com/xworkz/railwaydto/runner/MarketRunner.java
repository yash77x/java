package com.xworkz.railwaydto.runner;

import com.xworkz.railwaydto.dto.MarketDTO;
import com.xworkz.railwaydto.repo.MarketRepository;
import com.xworkz.railwaydto.repo.MarketRepositoryImpl;

public class MarketRunner {

	public static void main(String[] args) {

		MarketDTO marketDTO1 = new MarketDTO("Hubli", "Mobiles", "Yash", true, false);
		MarketDTO marketDTO2 = new MarketDTO("Dharwad", "Flowers", "Omkar", true, true);
		MarketDTO marketDTO3 = new MarketDTO("chickpete", "Clothes", "Abhishek", true, true);
		MarketDTO marketDTO4 = new MarketDTO("Bangalore", "Gaming", "Amulya", false, false);
		MarketDTO marketDTO5 = new MarketDTO("Gadag", "Fruits", "Suchitra", true, true);

		MarketRepository marketRepository = new MarketRepositoryImpl();
		marketRepository.save(marketDTO1);
		marketRepository.save(marketDTO2);
		marketRepository.save(marketDTO3);
		marketRepository.save(marketDTO4);
		marketRepository.save(marketDTO5);

		System.out.println("-------------------------");

		System.out.println(marketRepository.findByArea("Dharwad"));

		System.out.println("------------------------");

		System.out.println(marketRepository.findByOwner("Omkar"));

		System.out.println("------------------------");

		MarketDTO[] marketdto = marketRepository.readAll();
		for (int i = 0; i < marketdto.length; i++) {
			if (marketdto != null) {
				System.out.println(marketdto[i]);
			}
		}

	}

}
