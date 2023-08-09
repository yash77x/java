package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.laptop.Gaming;
import com.xworkz.abstraction.app.laptop.LenovoLaptop;

public class LaptopRunner {

	public static void main(String[] args) {

		LenovoLaptop laptop = new LenovoLaptop();
		
		Gaming gaming = new Gaming(laptop);
		gaming.getDisplay();
	}

}
