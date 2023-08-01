package com.xworkz.strings;

public class StringMethods {

	public static void main(String[] args) {

		String flag = "Lenovo is a Laptop";
		System.out.println(flag.charAt(12));
		System.out.println(flag.concat("Brand"));
		System.out.println(flag.substring(7));
		System.out.println(flag.indexOf("i"));
		
		String brand = "Lenovo";
		String brand1 = "lenovo";
		String brand2 = "Lenovo";
		
		System.out.println(brand.equalsIgnoreCase(brand1));
		System.out.println(brand.equals(brand1));
		System.out.println(brand.compareTo(brand2));
		System.out.println(brand.compareToIgnoreCase(brand1));
		
		String loc = "Bangalore";
		char l[] = loc.toCharArray();
		for (int i = 0; i<l.length; i++)
		{
			System.out.println(l[i]);
		}
		
		System.out.println(loc.toUpperCase());
		System.out.println(loc.isEmpty());
		System.out.println(loc.length());
		System.out.println(loc.startsWith("B"));
		System.out.println(loc.replace("a", "e"));
		System.out.println(flag.replaceAll("L", "J"));
	}

}
