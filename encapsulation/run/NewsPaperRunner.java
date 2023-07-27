package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.NewsPaper;

public class NewsPaperRunner {

	public static void main(String[] args) {

		NewsPaper news = new NewsPaper();
		System.out.println(news);
		
		news.setEditor("DH");
		news.setName("Deccan Herald");
		news.setNoOfPages(12);
		news.setPrice(5.5);
		news.setWonAwards(true);
		
		System.out.println("-------------------");
		System.out.println(news);
	}

}
