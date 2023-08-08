package com.xworkz.diamondproblem.runner;

import com.xworkz.diamondproblem.cooldrink.BTMCoolDrink;
import com.xworkz.diamondproblem.cooldrink.CokeCoolDrink;
import com.xworkz.diamondproblem.cooldrink.CoolDrink;
import com.xworkz.diamondproblem.cooldrink.PepsiCoolDrink;

public class CoolDrinkRunner {

	public static void main(String[] args) {

		BTMCoolDrink btmCoolDrink = new BTMCoolDrink();
		btmCoolDrink.energy();
		btmCoolDrink.stamina();
		btmCoolDrink.cool();
		
		PepsiCoolDrink  ps = new BTMCoolDrink();
		ps.cool();
		ps.energy();
		
		CokeCoolDrink cd = new BTMCoolDrink();
		cd.cool();
		cd.stamina();
		
		CoolDrink cool = new BTMCoolDrink();
		cool.cool();
	}

}
