package com.xworkz.inheritance.hierarchical;

public class HierarchicalRunner {
	
	public static void main(String[] args) {
		Mercedes mercedes = new Mercedes("Mercedes", 260, "Benz");
		System.out.println(mercedes);
		
		System.out.println("------------------");
		
		Bmw bmw = new Bmw("BMW", "left", 2);
		System.out.println(bmw);
	}

}
