package com.xworkz.diamondproblem.runner;

import com.xworkz.diamondproblem.laptop.DellLaptop;
import com.xworkz.diamondproblem.laptop.GamingLaptop;
import com.xworkz.diamondproblem.laptop.Laptop;
import com.xworkz.diamondproblem.laptop.LenovoLaptop;

public class LaptopRunner {
	public static void main(String[] args) {
		
		Laptop laptop = new GamingLaptop();
		laptop.getProcessor();
		laptop.getMemory();
		
		LenovoLaptop lenovoLaptop = new GamingLaptop();
		lenovoLaptop.getMemory();
		lenovoLaptop.getProcessor();
		lenovoLaptop.getbattery();
		
		DellLaptop dellLaptop = new GamingLaptop();
		dellLaptop.getMemory();
		dellLaptop.getProcessor();
		dellLaptop.getOS();
		
		GamingLaptop gamingLaptop = new GamingLaptop();
		gamingLaptop.getProcessor();
		gamingLaptop.getMemory();
		gamingLaptop.getbattery();
		gamingLaptop.getOS();
	}

}
