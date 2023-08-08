package com.xworkz.diamondproblem.runner;

import com.xworkz.diamondproblem.rice.BiryaniRice;
import com.xworkz.diamondproblem.rice.EggRice;
import com.xworkz.diamondproblem.rice.Rice;
import com.xworkz.diamondproblem.rice.SpecialRice;

public class RiceRunner {
	public static void main(String[] args) {
		
		Rice rice = new SpecialRice();
		rice.tasty();
		rice.spicy();
		
		EggRice eggRice = new SpecialRice();
		eggRice.tasty();
		eggRice.spicy();
		eggRice.egg();
		
		BiryaniRice biryaniRice = new SpecialRice();
		biryaniRice.tasty();
		biryaniRice.spicy();
		biryaniRice.chicken();
		
		SpecialRice specialRice = new SpecialRice();
		specialRice.chicken();
		specialRice.egg();
		specialRice.spicy();
		specialRice.tasty();
	}

}
