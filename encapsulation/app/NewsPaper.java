package com.xworkz.encapsulation.app;

public class NewsPaper {
	
	private String name;
	private int noOfPages;
	private double price;
	private String editor;
	private boolean wonAwards;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	
	public boolean isWonAwards() {
		return wonAwards;
	}
	public void setWonAwards(boolean wonAwards) {
		this.wonAwards = wonAwards;
	}

	@Override
	public String toString() {
		return name + "\n" + noOfPages + "\n" + price + "\n" + editor + "\n" + wonAwards;

	}
	
}
