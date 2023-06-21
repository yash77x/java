public class Array{
	public static void main(String[] args){
		int[] ram = {2,4,6,8,16};
		int[] storage = {32,64,128,256,512};
		int[] noOfBeds = {2,3,1,4,5};
		int[] marksOfStudent = {56,78,75,98,88};
		int[] studentsPresent = {20,23,21,25,27};
		char[] vowels = {'a','e','i','o','u'};
		char[] divisionOfClass = {'A','B','C','D','E'};
		byte[] age = {34,18,21,56,45};
		float[] cgpa = {6.3f,7.4f,7.5f,8.1f,9.0f};
		float[] avgOfIndianBatters = {34.54f,45.8f,29.9f,52.2f,48.7f};
		
		System.out.println(ram[3]);
		System.out.println(storage[3]);
		System.out.println(noOfBeds[3]);
		System.out.println(marksOfStudent[3]);
		System.out.println(studentsPresent[3]);
		System.out.println(vowels[3]);
		System.out.println(divisionOfClass[3]);
		System.out.println(age[3]);
		System.out.println(cgpa[3]);
		System.out.println(avgOfIndianBatters[3]);

		float[] temperature = new float[5];
		temperature[0] = 33.8f;
		temperature[1] = 27.3f;
		temperature[2] = 23.5f;
		temperature[3] = 35.9f;
		temperature[4] = 29.2f;

		int[] noOfCollege = new int[5];
		noOfCollege[0] = 70;
		noOfCollege[1] = 30;
		noOfCollege[2] = 90;
		noOfCollege[3] = 67;
		noOfCollege[4] = 93;

		char[] grade = new char[5];
     	   	grade[0] = 'A';
        	grade[1] = 'B';
        	grade[2] = 'C';
        	grade[3] = 'D';
        	grade[4] = 'F';

		char[] days = new char[7];
     	   	days[0] = 'M';
        	days[1] = 'T';
        	days[2] = 'W';
        	days[3] = 'T';
        	days[4] = 'F';
        	days[5] = 'S';
        	days[6] = 'S';


		float[] height = new float[5];
		height[0] = 5.8f;
		height[1] = 5.3f;
		height[2] = 6.2f;
		height[3] = 6.5f;
		height[4] = 4.9f;

		float[] weight = new float[5];
		weight[0] = 58.8f;
		weight[1] = 53.3f;
		weight[2] = 68.2f;
		weight[3] = 66.5f;
		weight[4] = 49.9f;

		int[] mumbaiWonIplOn = new int[5];
		mumbaiWonIplOn[0] = 2013;
		mumbaiWonIplOn[1] = 2015;
		mumbaiWonIplOn[2] = 2017;
		mumbaiWonIplOn[3] = 2019;
		mumbaiWonIplOn[4] = 2020;

		float[] weightInGrams = new float[5];
		weightInGrams[0] = 6.8f;
		weightInGrams[1] = 8.8f;
		weightInGrams[2] = 8.4f;
		weightInGrams[3] = 5.7f;
		weightInGrams[4] = 12.8f;

		float[] percentage = new float[5];
		percentage[0] = 67.8f;
		percentage[1] = 84.8f;
		percentage[2] = 88.4f;
		percentage[3] = 52.7f;
		percentage[4] = 92.8f;

		System.out.println(temperature[0]);
		System.out.println(noOfCollege[3]);
		System.out.println(grade[2]);
		System.out.println(days[4]);
		System.out.println(height[1]);
		System.out.println(weight[3]);
		System.out.println(mumbaiWonIplOn[2]);
		System.out.println(weightInGrams[4]);
		System.out.println(percentage[1]);

		for(int i=0;i<mumbaiWonIplOn.length;i++){
			System.out.println(mumbaiWonIplOn[i]);
		}

		for(int i=0;i<days.length;i++){
			System.out.println(days[i]);
		}

		for(int i=0;i<temperature.length;i++){
			System.out.println(temperature[i]);
		}

		for(int i=0;i<age.length;i++){
			System.out.println(age[i]);
		}

		for(int i=0;i<weight.length;i++){
			System.out.println(weight[i]);
		}
	}
}





		

