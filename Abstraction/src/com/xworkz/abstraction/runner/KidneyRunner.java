package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.kidney.HumanKidney;
import com.xworkz.abstraction.app.kidney.Mahesh;

public class KidneyRunner {

	public static void main(String[] args) {

		HumanKidney kidney = new HumanKidney();
		
		Mahesh mahesh = new Mahesh(kidney);
		mahesh.check();
	}

}
