package com.xworkz.encapsulation.app;

public class HeadSet {
	
	private String brand;
	private String connectivity;
	private int batteryLife;
	private boolean isNoiseCancelling;
	private int price;
	
	
	public String getBrand() {
		return brand;
	}
	
	public String getConnectivity() {
		return connectivity;
	}
	
	public int getBatteryLife() {
		return batteryLife;
	}
	
	public boolean isNoiseCancelling() {
		return isNoiseCancelling;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

	public void setNoiseCancelling(boolean isNoiseCancelling) {
		this.isNoiseCancelling = isNoiseCancelling;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return brand + "\n" + connectivity + "\n" + batteryLife + "\n" + isNoiseCancelling + "\n" + price;

	}

}
