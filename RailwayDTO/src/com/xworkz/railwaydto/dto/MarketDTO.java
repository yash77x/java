package com.xworkz.railwaydto.dto;

import java.io.Serializable;

public class MarketDTO implements Serializable {
	private String area;
	private String type;
	private String owner;
	private boolean crowded;
	private boolean cheap;

	public MarketDTO() {
		System.out.println("no-arg constructor of MarketDTO");
	}

	public MarketDTO(String area, String type, String owner, boolean crowded, boolean cheap) {
		super();
		this.area = area;
		this.type = type;
		this.owner = owner;
		this.crowded = crowded;
		this.cheap = cheap;
	}

	@Override
	public String toString() {
		return "[area=" + area + ", type=" + type + ", owner=" + owner + ", crowded=" + crowded
				+ ", cheap=" + cheap + "]";
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getowner() {
		return owner;
	}

	public void setMetro(String owner) {
		this.owner = owner;
	}

	public boolean isCrowded() {
		return crowded;
	}

	public void setCrowded(boolean crowded) {
		this.crowded = crowded;
	}

	public boolean isCheap() {
		return cheap;
	}

	public void setCheap(boolean cheap) {
		this.cheap = cheap;
	}

}
