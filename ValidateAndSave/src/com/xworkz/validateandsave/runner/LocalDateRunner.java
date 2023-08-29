package com.xworkz.validateandsave.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateRunner {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate date2 = LocalDate.of(2002, 03, 07);
		System.out.println(date2);
		
		LocalDate date3 = LocalDate.of(2023, 12, 25);
		System.out.println(date3);
		
		boolean check = date.isEqual(date2);
		System.out.println(check);
		
		boolean check1 = date.isAfter(date2);
		System.out.println(check1);
		
		boolean check2 = date.isBefore(date3);
		System.out.println(check2);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDateTime dateTime2 = LocalDateTime.of(2002, 07, 03, 23, 30, 30);
		System.out.println(dateTime2);
		
		LocalDateTime dateTime3 = LocalDateTime.of(2024, 03, 07, 13, 50, 10);
		System.out.println(dateTime3);
		
		boolean check3 = dateTime.isEqual(dateTime3);
		System.out.println(check3);
		
		boolean check4 = dateTime.isBefore(dateTime3);
		System.out.println(check4);
		
		boolean check5 = dateTime.isAfter(dateTime3);
		System.out.println(check5);
	}

}
