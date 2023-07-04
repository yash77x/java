public class Laptop{

	int ram;
	int storage;
	String Processor;
	int noOfPorts;
	String typesOfPorts;
	String operatingSystem;
	String osManufacturer;
	int price;
	int screenResolution;
	int batteryBackup;
	float windowsVersion;
	String brand;
	String model;
	float laptopDimensions;
	int weight;
	float softwareIncluded;
	String graphicsCard;
	String color;
	String biometricSecurity;
	float wifiTechnology;

	public Laptop(int ram, int storage, String brand, String color){
		this.ram = ram;
		this.storage = storage;
		this.brand = brand;
		this.color = color;
	}
	
	public static void main(String[] args) {
		Laptop config = new Laptop(8, 512, "Lenovo", "black");
		System.out.println("Ram = " +config.ram);
		System.out.println("storage = " +config.storage);
		System.out.println("brand = " +config.brand);
		System.out.println("color = " +config.color);
	}

	public static void gaming(){

	}

	public static void presentation(){

	}

	public static void installSoftwares(){

	}

	public static void watchMovies(){

	}

	public static void playSongs(){

	}

	public static void communication(){

	}

	public static void navigation(){

	}

	public static void internetBanking(){

	}

	public static void internetSurfing(){

	}

	public static void elearning(){

	}

}