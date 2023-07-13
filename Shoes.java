public class Shoes{
	int price;
	String brand;
	boolean isWaterproof;
	ShoeMaterial material = ShoeMaterial.CANVAS;
	ShoeSize size = ShoeSize.LARGE;

	public static void main(String[] args) {
		Shoes shoe =new Shoes(3000,"Puma",true);
		System.out.println(shoe.getprice());
		System.out.println(shoe.getbrand());
		System.out.println(shoe.getisWaterproof());

		System.out.println(shoe.material.getMaterial());
	    System.out.println(shoe.size.getSize());
	}

	public Shoes(int price, String brand, boolean isWaterproof){
		this.price = price;
		this.brand = brand;
		this.isWaterproof = isWaterproof;
	}

	public float getprice(){
		return price;
	} 
	public String getbrand(){
		return brand;
	}
	public boolean getisWaterproof(){
		return isWaterproof;
	}

}

enum ShoeMaterial {
	LEATHER("Leather"), CANVAS("Canvas"), MESH("Mesh");
	String value;

	ShoeMaterial(String value){
		this.value = value;
	}

	public String getMaterial(){
		return this.value;
	}
}

enum ShoeSize{
	SMALL(5), MEDIUM(7), LARGE(9);		
	int value1;

	ShoeSize(int value1){
		this.value1 = value1;
	}

	public int getSize(){
		return value1;
	}
}