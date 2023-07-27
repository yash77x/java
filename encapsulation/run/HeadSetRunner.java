package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.HeadSet;

public class HeadSetRunner {
	
	public static void main(String[] args) {
		
		HeadSet head = new HeadSet();
		System.out.println(head);
		
		head.setBatteryLife(24);
		head.setBrand("boat");
		head.setConnectivity("bluetooth");
		head.setNoiseCancelling(true);
		head.setPrice(1200);
		
		System.out.println("-------------------");
		System.out.println(head);
		
	}

}
