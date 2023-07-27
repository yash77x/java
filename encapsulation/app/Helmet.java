package com.xworkz.encapsulation.app;

public class Helmet {
	
	private String brand;
	private int modelYear;
	private String color;
	private boolean isApproved;
	private String Size;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public boolean isApproved() {
		return isApproved;
	}
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	
	
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	
	@Override
	public String toString() {
		return brand + "\n" + modelYear + "\n" + color + "\n" + isApproved + "\n" + Size;

	}

}
