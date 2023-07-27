package com.xworkz.encapsulation.app;

public class Grinder {
	
	private String brand;
	private String material;
	private boolean hasTimer;
	private int rpm;
	private int price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	public boolean isHasTimer() {
		return hasTimer;
	}
	public void setHasTimer(boolean hasTimer) {
		this.hasTimer = hasTimer;
	}
	
	
	public int getRpm() {
		return rpm;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return brand + "\n" + material + "\n" + hasTimer + "\n" + rpm + "\n" + price;
	}
	

}
