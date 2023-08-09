package com.xworkz.abstraction.app.smartwatch;

public class WristWatch {
	
	private SmartWatch smartWatch;

	public WristWatch(SmartWatch smartWatch) {
		super();
		this.smartWatch = smartWatch;
	}

	public void getShowTime() {
		if (smartWatch != null) {
			System.out.println("smartWatch is not null");
			this.smartWatch.showTime();
		}
		else {
			System.out.println("smartWatch is null");
		}
	}

}
