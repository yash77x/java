package com.xworkz.runtimepolymorphism;

public class OverridingRunner {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.printInfo();
		
		System.out.println("--------------");
		
		Dog dog = new Dog();
		dog.breed();
		dog.printInfo();
		
		System.out.println("--------------");

		Dog2 dog2 = new Dog2();
		dog2.breed();
		
		System.out.println("--------------");

		Cat cat = new Cat();
		cat.printInfo();
	}

}
