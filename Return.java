public class Return{
	public static void main(String[] args){
		byte age=byted();
		System.out.println(age);

		int multiplied=intd();
		System.out.println(multiplied);

		short result=shortd();
		System.out.println(result);

		long number=longd();
		System.out.println(number);

		char days=chard();
		System.out.println(days);

		float subtract=floatd();
		System.out.println(subtract);

		double pi=doubled();
		System.out.println(pi);

		boolean check=booleand();
		System.out.println(check);

		String car=stringd();
		System.out.println(car);
		
	}
	public static byte byted(){
		byte a=18;
		return a;
	}
	public static short shortd(){
		short b=3478;
		return b;
	}
	public static int intd(){
		int a = 10;
		int b = 2;
		int c = a*b;
		return c;
	}
	public static long longd(){
		long d=45678988L;
		return d;
	}
	public static float floatd(){
		float cgpa=7.63f;
		return cgpa;
	}
	public static double doubled(){
		double pie=3.14159;
		return pie;
	}
	public static boolean booleand(){
		int number=23;
		if(number>=0){
			return true;
		}
		else{
			return false;
		}
	}
	public static char chard(){
		char j='M';
		return j;
	}
	public static String stringd(){
		String i="BMW";
		return i;
	}
	
	
	
	
}