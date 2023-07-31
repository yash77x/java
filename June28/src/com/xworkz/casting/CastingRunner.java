package com.xworkz.casting;

public class CastingRunner {

	public static void main(String[] args) {
		Shoes shoes = new Puma("Black", 2000, "USA", "Sports");
		CastingRunner.buy(shoes);
		
		System.out.println("--------------");

		Shoes shoes2 = new Nike("Blue", 3000, "Yash", true);
		CastingRunner.buy(shoes2);
	}
	
	static void buy(Shoes shoe) {
		if(shoe != null)
		{
			if(shoe instanceof Puma)
			{
				Puma puma = (Puma)shoe;
				System.out.println("It is instance");
				puma.print();
			}
			if(shoe instanceof Nike)
			{
				Nike nike = (Nike)shoe;
				System.out.println("It is instance");
				nike.print();
			}
		}
	}

}
