package com.xworkz.tiktok.interfac.runner;

import com.xworkz.tiktok.interfac.app.BangaloreMetro;
import com.xworkz.tiktok.interfac.app.BawarchiHotel;
import com.xworkz.tiktok.interfac.app.Belgavi;
import com.xworkz.tiktok.interfac.app.BoysHostel;
import com.xworkz.tiktok.interfac.app.FortisHospital;
import com.xworkz.tiktok.interfac.app.HairSaloon;
import com.xworkz.tiktok.interfac.app.HouseHome;
import com.xworkz.tiktok.interfac.app.HubliAirport;
import com.xworkz.tiktok.interfac.app.IndianArmy;
import com.xworkz.tiktok.interfac.app.SbiBank;
import com.xworkz.tiktok.interfac.app.TcsCompany;

public class InterfacRunner {

	public static void main(String[] args) {

		HubliAirport airport = new HubliAirport();
		System.out.println(airport.location);
		airport.getFood();
		airport.getTicket();
		
		System.out.println("----------------------");
		
		IndianArmy  army = new IndianArmy();
		System.out.println(army.WorkTime);
		army.getHairCut();
		army.getUniform();
		
		System.out.println("----------------------");

		BangaloreMetro metro = new BangaloreMetro();
		System.out.println(metro.started);
		metro.getPlatform();
		metro.getTicket();
		
		System.out.println("----------------------");

		SbiBank bank = new SbiBank();
		System.out.println(bank.bank);
		bank.getPassbook();
		bank.getWait();
		
		System.out.println("----------------------");

		BawarchiHotel hotel = new BawarchiHotel();
		System.out.println(hotel.noOfFloors);
		hotel.payBill();
		hotel.timings();
		
		System.out.println("----------------------");

		Belgavi belgavi = new Belgavi();
		System.out.println(belgavi.university);
		belgavi.getExamFee();
		belgavi.marksCard();
		
		System.out.println("----------------------");

		BoysHostel hostel = new BoysHostel();
		System.out.println(hostel.warden);
		hostel.getFee();
		hostel.lightsOff();
		
		System.out.println("----------------------");

		FortisHospital hospital = new FortisHospital();
		System.out.println(hospital.hospital);
		hospital.getMedicine();
		hospital.noOfDoctors();
		
		System.out.println("----------------------");

		HairSaloon saloon = new HairSaloon();
		System.out.println(saloon.cut);
		saloon.timings();
		saloon.waitForYourTurn();
		
		System.out.println("----------------------");

		HouseHome home = new HouseHome();
		System.out.println(home.name);
		home.studyWell();
		home.dontUseBadWords();
		
		System.out.println("----------------------");

		SbiBank sbiBank = new SbiBank();
		System.out.println(sbiBank.bank);
		sbiBank.getPassbook();
		sbiBank.getWait();
		
		TcsCompany company = new TcsCompany();
		System.out.println(company.time);
		company.getEmployeId();
		company.getFormal();

	}

}
