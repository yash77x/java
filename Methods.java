public class Methods{
	public static void main(String[] args){
		accountNo();
		temperature();
		roomNo();
		division();
		days();

	}

public static void accountNo()
	{
		long[] accountNo = new long[5];
		accountNo[0] = 34567876543l;
		accountNo[1] = 87654345676l;
		accountNo[2] = 65434567887l;
		accountNo[3] = 90987346567l;
		accountNo[4] = 45678985872l;
		for(int i = 0; i<=accountNo.length-1;i++)
		{
			System.out.println(accountNo[i]);
		}
	}

public static void temperature()
	{
		float[] temperature = new float[5];
		temperature[0] = 33.8f;
		temperature[1] = 27.3f;
		temperature[2] = 23.5f;
		temperature[3] = 35.9f;
		temperature[4] = 29.2f;
		for(int i = 0; i<=temperature.length-1;i++)
		{
			System.out.println(temperature[i]);
		}
	}

public static void roomNo()
	{
		int[] roomNo = { 101, 201 , 301, 401, 501};
		for(int i=0;i<=roomNo.length-1;i++)
		{
			System.out.println(roomNo[i]);
		}
		
	}


public static void division()
	{
		char[] divisionOfClass = {'A','B','C','D','E'};
		for(int i=0;i<=divisionOfClass.length-1;i++)
		{
			System.out.println(divisionOfClass[i]);
		}
		
	}

public static void days()
	{
		char[] days = new char[7];
     	   	days[0] = 'M';
        	days[1] = 'T';
        	days[2] = 'W';
        	days[3] = 'T';
        	days[4] = 'F';
        	days[5] = 'S';
        	days[6] = 'S';
		for(int i = 0; i<=days.length-1;i++)
		{
			System.out.println(days[i]);
		}
	}
}