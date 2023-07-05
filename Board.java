public class Board{
	public static void main(String[] args){
	
	String brand = "Lenovo";
	System.out.println(brand);

	String state = "Karnataka";
	System.out.println(state);

	String country = "India";
	System.out.println(country);

	String car = "BMW";
	System.out.println(car);

	String company = "Mindtree";
	System.out.println(company);

	String college = "SKSVMACET";
	System.out.println(college);

	String branch = "Information Science";
	System.out.println(branch);

	String institute = "xworkz";
	System.out.println(institute);

	String color = "black";
	System.out.println(color);

	String movie = "Avengers";
	System.out.println(movie);
	



    	String mobile = new String("samsung m31");
	System.out.println(mobile);

	String operatingSystem = new String("Android 11");
	System.out.println(operatingSystem);

	String screen = new String("LCD");
	System.out.println(screen);

	String username = new String("yash77x");
	System.out.println(username);

	String pet = new String("cat");
	System.out.println(pet);

	String university = new String("VTU");
	System.out.println(university);

	String sport = new String("cricket");
	System.out.println(sport);

	String destination = new String("Hubli");
	System.out.println(destination);

	String motherTongue = new String("Hindi");
	System.out.println(motherTongue);

	String connectivity = new String("wifi");
	System.out.println(connectivity);


	String returenedBrand = brand.toUpperCase();
	System.out.println(returenedBrand);
	
	String returnedStatet = state.toLowerCase();
	System.out.println(returnedStatet);

	boolean inst = institute.endsWith("z");
	System.out.println(inst);

	int result = movie.compareTo("Avengers");
	System.out.println(result);

	String result4 = college.replace('m' , 'd');
	System.out.println(result4);
}
}

