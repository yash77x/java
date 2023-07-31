package com.xworkz.consoverloading;

public class Runner {

	public static void main(String[] args) {

		Bank bank = new Bank(7, "Rupees");
		System.out.println(bank.atmCardSize);
		System.out.println(bank.currency);
		
		System.out.println("------------------");
		
		Bank bank2 = new Bank(6, "Rupees", accType.SAVINGS, transactionType.DEPOSIT);
		System.out.println(bank2);
		
	}

}
