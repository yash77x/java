public class Institute{
	public static void main(String[] arrgs){

		add(20,8);		//calling method with int,int values
    		add(15,5,10);		//calling method with int,int,int values
		add(20,(byte)10);	//calling method with int,byte values
		add(10,7.7f);		//calling method with int,float values
		add(10,(short)20);	//calling method with int,short values
		add((short)10,20);	//calling method with short,int values
    
		area(10);      			//calling method with int n1
		area(10 , 20);  		//calling method with int n1 , int n2
		area(10 , (byte)30);  		//calling method with int n1 , byte n2
		area((byte)10 , (byte)30);  	//calling method with byte n1,byte n2
		area((short)10 , 4.8d); 	//calling method with short n1,double n2
		area(3.5d , (short)30); 	//calling method with double n1,short n2

		getTemperature(10,50);  	//calling method with int t1, int t2	
		getTemperature(10,50,20);  	//calling method with int t1, int t2, int t3
		getTemperature(10,5.0f);  	//calling method with int t1, float t2
		getTemperature(1.0f,5.0f);  	//calling method with float t1, float t2
		getTemperature((short)10,5.0d); //calling method with short t1, double t2
		getTemperature(1.0d,(short)50); //calling method with double t1, short t2

	}

	public static void add(int value1,int value2)
	{
		
		System.out.println("added 1");
	}

	public static void add(int value1,int value2,int value3)
	{
    		System.out.println("added 2");	
	}

	public static void add(int value1,byte value2)
	{
		System.out.println("added 3");
	}

	public static void add(int value1,float value2)
	{
		System.out.println("added 4");
	}


	public static void add(int value1,short value2)
	{
		System.out.println("added 5");
	}

	public static void add(short value1,int value2)
	{
		System.out.println("added 6");
	}



	public static void area(int n1)
	{
		System.out.println("area 1");
	}

	public static void area(int n1 , int n2)
	{
		System.out.println("area 2");
	}

	public static void area(int n1 , byte n2)
	{
		System.out.println("area 3");
	}

	public static void area(byte n1 , byte n2)
	{
		System.out.println("area 4");
	}

	public static void area(short n1 , double n2)
	{
		System.out.println("area 5");
	}

	public static void area(double n1 , short n2)
	{
		System.out.println("area 6");
	}

	public static float getTemperature(int t1 , int t2)
	{
		System.out.println("Temperature 1");
		return t1;
	}

	public static void getTemperature(int t1 , int t2 , int t3)
	{
		System.out.println("Temperature 2");

	}

	public static void getTemperature(int t1 , float t2)
	{
		System.out.println("Temperature 3");
	}

	public static void getTemperature(float t1 , float t2)
	{
		System.out.println("Temperature 4");
	}

	public static void getTemperature(short t1 , double t2)
	{
		System.out.println("Temperature 5");
	}

	public static void getTemperature(double t1 , short t2)
	{
		System.out.println("Temperature 6");
	}

}

