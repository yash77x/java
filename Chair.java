public class Chair{
	float cgpa;
	char grade;
	long accNo;
	String country;
	int salary;
	
	public Chair()
	{
		System.out.println("Default Constructor");
		System.out.println(cgpa);
		System.out.println(grade);
		System.out.println(accNo);
		System.out.println(country);
		System.out.println(salary);
	}

	public Chair(float cgpa1, char grade1, long accNo1, String country1, int salary1)
	{
		System.out.println("parameterized Constructor");
		cgpa = cgpa1;
		grade = grade1;
		accNo = accNo1;
		country = country1;
		salary = salary1;
	}

	public static void main(String[] args)
	{
		new Chair();
		System.out.println("---------------------------");
		Chair chair = new Chair(7.63f, 'B', 456789087l, "INDIA", 400000);
		System.out.println(chair.cgpa);
		System.out.println(chair.grade);
		System.out.println(chair.accNo);
		System.out.println(chair.country);
		System.out.println(chair.salary);
	}
}