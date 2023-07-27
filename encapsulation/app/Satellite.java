package com.xworkz.encapsulation.app;

public class Satellite {
	
	private String name;
	private int launchYear;
	private String Country;
	private double weight;
	private boolean isOperational;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getLaunchYear() {
		return launchYear;
	}
	public void setLaunchYear(int launchYear) {
		this.launchYear = launchYear;
	}
	
	
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	public boolean isOperational() {
		return isOperational;
	}
	public void setOperational(boolean isOperational) {
		this.isOperational = isOperational;
	}
	
	@Override
	public String toString() {
		return name + "\n" + launchYear + "\n" + Country + "\n" + weight + "\n" + isOperational;

	}

}
