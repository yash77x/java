package com.xworkz.consoverloading;

public class Bank {
	int atmCardSize;
	String currency;
	accType type;
	transactionType ttype;
	
	public Bank() {
		System.out.println("This is a default constructor");
	}

	public Bank(int atmCardSize, String currency) {
		this.atmCardSize = atmCardSize;
		this.currency = currency;
	}
	
	public Bank(int atmCardSize, String currency, accType type, transactionType ttype) {
		this(atmCardSize,currency);
		this.type = type;
		this.ttype = ttype;
	}
	
	@Override
	public String toString() {
		return "Atm Card Size= " + atmCardSize + "\n" + "Currency= " + currency + "\n" + "Account Type= " + type + "\n" + "Transaction Type= " + ttype;

	}
	 
}
enum accType{
	SAVINGS, CURRENT;
}

enum transactionType{
	DEPOSIT, WITHDRAWL;
}