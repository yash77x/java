package com.xworkz.runtimepolymorphism;

public class Dog extends Animal {
	
	@Override
	public void printInfo() {
		System.out.println("This is a Dog");
	}
	
	public void breed() {
		System.out.println("It is a Golden Retriever");
	}

}
