package com.xworkz.encapsulation.app;

public class Dosa {

	private String type;
	private int price;
	private String filling;
	private boolean chutney;
	private String hotel;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String getFilling() {
		return filling;
	}
	public void setFilling(String filling) {
		this.filling = filling;
	}
	
	
	public boolean isChutney() {
		return chutney;
	}
	public void setChutney(boolean chutney) {
		this.chutney = chutney;
	}
	
	
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	
	@Override
	public String toString() {

		return type + "\n" + price + "\n" + filling + "\n" + chutney + "\n" + hotel;
	}
	
	
}
