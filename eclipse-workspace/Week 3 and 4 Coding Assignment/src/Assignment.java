
public class Assignment {

	public static void main(String[] args) {
		// 1
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 45};
		int value = ages[ages.length-1] - ages[0];
		System.out.println(value);
		int sum = 0;
		
		
		for(int age : ages) {
			sum+= age;
		}
		int averageAge = sum / ages.length;
		System.out.println(averageAge);
		
		//2
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int totalNameLength = 0;
		
		for(String name : names) {
			totalNameLength += name.length(); 
		}
		int averageLength = totalNameLength / names.length;
		System.out.println(averageLength);
		
		String concatenation = "";
		for(String name : names) {
			concatenation += name + " ";
			
		}
		System.out.println(concatenation);
		
		//5
		int[] nameLengths = new int[names.length];
		
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
			
		
		for(int nameCount : nameLengths) {
			System.out.print(nameCount + " ");
		}
		//6
		int sumOfNames = 0;
		for(int length : nameLengths) {
			 sumOfNames += length;
		}
		System.out.println("\n" + sumOfNames);
		
		//7
		System.out.println(stringMethod("word", 8));
		
		//8
		System.out.println(fullName("Edward", "Rodriguez"));
		
		//9
		int[] numbers = {34, 45, 6, 8,4};
		System.out.println(moreThan100(numbers));
		
		//10
		double [] groceryBill = {23.55, 34.77, 34.68, 3.78, 8.6};
		System.out.println(averageOfElements(groceryBill));
		
		//11
		double[] array1 = {34.2, 3.6, 45.5};
		double[] array2 = {65.3, 29.4, 1.4};
		System.out.println(firstArrayIsLarger(array1, array2));
		
		//12
		boolean summer = false;
		double money = 23.56;
		System.out.println(willBuyDrink(summer, money));
		
		//13
		double grade = 85.12;
		int tryoutRanking = 26;
		System.out.println(canPlayOnTeam(grade, tryoutRanking));
		
		
		}
	//7
	public static String stringMethod(String word, int n) {
		String concat = "";
		for(int i = 0; i <= n; i++) {
			
			concat +=word;
		}
		return concat;
		
		//8
		}
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	//9
	public static boolean moreThan100(int[] x) {
		int sum = 0;
		for(int number : x) {
			sum+=number;	
		}
		if(sum > 100) {
			return true;
		}
		else {
			return false;
		}
	}
	//10
	public static double averageOfElements(double[] x) {
		double sum = 0;
		for(double number: x) {
			sum+=number;
		}
		double average = sum / x.length;
		return average;
	}
	
	//11
	public static boolean firstArrayIsLarger(double[] x, double [] y) {
		double sum1 = 0;
		double sum2 = 0;
		for(double num : x) {
			sum1 += num;
		}
		for(double nums : y) {
			sum2 += nums;
		}
		if(sum1 > sum2) {
			return true;
		}else {
			return false;
		}
	}
	
	//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		}
	}
	//13 this is my own method and it checks to see if the student is eligible to play with the school team
	//I created it because I have been slowly getting back into soccer and I thought it would be fun to make a method about it
	public static boolean canPlayOnTeam(double grade, int tryoutRanking) {
		if(grade >= 70.0 && tryoutRanking <=25) {
			return true;
		}else {
			return false;
		}
	}

}
