package com.xworkz.encapsulation.app;

public class Tap {
	
	private double flowRate;
	private String brand;
	private String material;
	private boolean isTouchless;
	private int weight;
	
	
	public double getFlowRate() {
		return flowRate;
	}
	public void setFlowRate(double flowRate) {
		this.flowRate = flowRate;
	}
	
	
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
	
	
	public boolean isTouchless() {
		return isTouchless;
	}
	public void setTouchless(boolean isTouchless) {
		this.isTouchless = isTouchless;
	}
	
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return flowRate + "\n" + brand + "\n" + material + "\n" + isTouchless + "\n" + weight;

	}

	
}
