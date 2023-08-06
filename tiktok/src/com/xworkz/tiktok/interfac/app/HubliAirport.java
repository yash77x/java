package com.xworkz.tiktok.interfac.app;

public class HubliAirport implements AirportRule{

		@Override
		public void getTicket() {
			System.out.println("Ticket should be booked");
		}

		@Override
		public void getFood() {
			System.out.println("Food should be taken");

		}
}
