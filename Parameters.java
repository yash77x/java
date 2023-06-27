public class Parameters{
	public static void main(String[] args){
	
		boolean returnedResult=isPrimeNumber(10);
		System.out.println(returnedResult);

		int returnedValue=add(20,10);
		System.out.println(returnedValue);

		int returnedSubValue=sub(20,10);
		System.out.println(returnedSubValue);

		boolean returnedName=checkStudentName("yash");
		System.out.println(returnedName);

		boolean returnedAge=voting(21);
		System.out.println(returnedAge);
		
		int returnedBiggest=biggestOfThree(34,12,32);		
		System.out.println(returnedBiggest);

        	String oddEven = checkOddEven(4);
        	System.out.println(oddEven);

		int returnedSmallest=smallest(4,12,32);		
		System.out.println(returnedSmallest);

        	String returnedGrade = grade(76);
		System.out.println(returnedGrade);

		boolean returnedAccNo = accNo(789987653);
		System.out.println(returnedAccNo);

	}

	
	public static boolean isPrimeNumber(int num){
		if(num%2==0){
			System.out.println("It is prime number");
			return true;
		}
		else{
			System.out.println("It is not prime number");
			return false;
		}
	}

	
	public static int add(int a,int b){
		int c=a+b;
		return c;
	}


	public static int sub(int a,int b){
		if(b>a)
			return b-a;
		else 
			return a-b;
	}


	public static boolean checkStudentName(String name){
		if(name.length()>5){
			System.out.println("name is valid");
			return true;
		}
		else{
			System.out.println("name is not valid");
			return false;
		}
	}


	public static boolean voting(int age){
		if(age>=18){
			System.out.println("eligible to vote");
			return true;
		}
		else{
			System.out.println("not eligible to vote");
			return false;
		}
	}


	public static int biggestOfThree(int x, int y, int z){
		if (x >= y && x >= z)
			return x;
 	        else if (y >= x && y >= z)
 		        return y;
 		else
 	            	return z;
    	}


	public static String checkOddEven(int num) {
        	if (num % 2 == 0)
			return "Even";
        	else 
        		return "Odd";
    	}


	public static int smallest(int m, int n, int o){
		if(m < n && m < o)
			return m;
		else if(n < m && n < o)
			return n;
		else 
			return o;
	}

    
	public static String grade(int marks) {
        	if (marks >= 90) 
            		return "A Grade";
         	else if (marks >= 80) 
            		return "B Grade";
         	else if (marks >= 70) 
            		return "C Grade";
         	else if (marks >= 60) 
            		return "D Grade";
         	else 
            		return "Fail";
    	}


	public static boolean accNo(long num){
		if(num > 10){
			System.out.println(" Acc number is valid");
			return true;
		}
		else{
			System.out.println("Acc number is invalid");
			return false;
		}
	}
}