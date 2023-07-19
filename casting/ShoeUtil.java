package com.xworkz.casting;

public class ShoeUtil {
	public static void main(String[] args) {
		Shoes shoe1 = new PumaShoe(4000, Size.MEDIUM, Color.BLACK, "Training", "USA");
		ShoeUtil.buy(shoe1);
		System.out.println("--------------------------------");
		Shoes shoe2 = new NikeShoe(5000, Size.LARGE, Color.BLUE, "John Donahoe", "Virat");
		ShoeUtil.buy(shoe2);
		
	}
	
	static void buy(Shoes shoe) {
		if(shoe!=null)
		{
			if(shoe instanceof PumaShoe) {
				PumaShoe puma = (PumaShoe)shoe;
				System.out.println("It is Instance of PumaShoe");
				puma.printInfo();
			}

			
			if(shoe instanceof NikeShoe) {
				NikeShoe nike = (NikeShoe)shoe;
				System.out.println("It is Instance of NikeShoe");
				nike.printInfo();
			}

		}
	}
}
