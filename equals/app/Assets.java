package com.xworkz.equals.app;

public class Assets {
	
	private String name;
	private int value;
	private String type;
	
	public Assets(String name, int value, String type) {
		this.name = name;
		this.value = value;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Name=" + name + "\n" + "Value=" + value + "\n" + "Type=" + type;	
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null)
		{
			System.out.println("Object is not null, can proceed further");
			if(obj instanceof Assets) {
				Assets casted = (Assets) obj;
				if(this.name == casted.name && this.type == casted.type && this.value == casted.value)
				{
					System.out.println("Both objects are same");
					return true;
				}
				else {
					System.err.println("Both are not same");
				}
				
			}
			else {
				System.err.println("Object is not mat");
			}
		}
		else {
			System.err.println("Object is null");
		}
		return false;
	}

}
