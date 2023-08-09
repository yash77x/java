package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.smartwatch.BoatSmartWatch;
import com.xworkz.abstraction.app.smartwatch.WristWatch;

public class SmartWatchRunner {

	public static void main(String[] args) {

		BoatSmartWatch watch = new BoatSmartWatch();
		
		WristWatch wristWatch = new WristWatch(watch);
		wristWatch.getShowTime();
	}

}
