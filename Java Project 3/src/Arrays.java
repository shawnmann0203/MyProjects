
public class Arrays {

	public static void main(String[] args) {
		
		//*****ARRAYS AND FOR LOOPS*****//
		
		int[] ages = {3,9,23,64,2,8,28,93,30};
		
		for (int age : ages) {
			System.out.println(age);
		}
		
		
		System.out.println();
		
		ages[ages.length -1]-= ages[0];
		for (int age : ages) {
			System.out.println(age);
		}
		
		System.out.println();
		
		
		double average = 0;
		
		for (int age : ages) {
			average += age;
		}
		average = average / ages.length;
		System.out.println("The average age of the array is: " + average);
		
		System.out.println();
		
		//*****STRING ARRAYS*****//
		
		String[] names = {"Sam", "Tim", "Sally", "Buck", "Bob"};
		average = 0;
		for (String name : names) {
			System.out.println(name);
			average += name.length();
		}
		
		average = average / names.length;
		
				
		System.out.println("\nThe average length of each person's name is: " + average + " letters.");
		
		System.out.println();
		
		for (String name : names) {
			System.out.print(name + " ");
		}
		
		System.out.println();
		
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		System.out.println("\nThe name lengths: ");
		
		for (int length : nameLengths) {
			System.out.println(length);
		}
		
		int sum = 0;
		for (int length : nameLengths) {
			sum+= length;
		}
		
		System.out.println("\nThe sum of all the lengths of each name is: " + sum);
		
		//*****TESTING CALL METHODS*****//
		
		System.out.println();
		wordRepeat("Hello", 3);
		System.out.println("\n");
		
		
		String fullName = fullName("Shawn", "Stroh");
		
		System.out.println(fullName);
		
		int[] someNums = {3, 10, 20, 3, 15};
		
		System.out.println("\nIs the sum of all the ages we created more than 100? " + greaterThan100(ages));
		System.out.println("Is the sum of some numbers we created more than 100? " + greaterThan100(someNums));
		
		double[] moreNums = {23.2, 12.87, 7, 89, 47.8765};
		System.out.println("\nAverage of the array of doubles we created is " + average(moreNums));
		
		double[] extraNums = {23.3, 88, 29, 38, 22};
		
		boolean compareArrays = compareAverage(moreNums, extraNums);
		
		System.out.println("\nAverage of the first Array: " + average(moreNums));
		System.out.println("Average of the second Array: " + average(extraNums));
		System.out.println("Is the average of the first array more than the second array? " + compareArrays);
		boolean hot = true;
		double money = 10.49;
		
		boolean shouldBuyDrink = willBuyDrink(hot, money);
		System.out.println("\nIs it hot outside? " + hot);
		System.out.println("How much money is in pocket? $" + money);
		System.out.println("Should we buy a drink? " + shouldBuyDrink);
		
		System.out.println();
		
		for (int numbers : someNums) {
			System.out.println(numbers);
		}
		
		System.out.println();
		System.out.println("Shuffle each number up one with the first number now being the last one.");
		moveUpOne(someNums);
		
		for (int numbers : someNums) {
			System.out.println(numbers);
		}
	}
	
	//*****METHODS*****//
	
	
	public static void wordRepeat(String word, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(word);
		}
	}
	
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	
	public static boolean greaterThan100(int[] n) {
	int sum = 0;
	for (int i = 0; i < n.length; i++) {
		sum += n[i];
		}
	if(sum > 100) {
		return true;
	}
	return false;
	}
	
	
	public static double average(double[] n) {
		double sum = 0;
		for (double numbers : n) {
			sum += numbers;
		}
		return sum / n.length;
	}
	
	
	public static boolean compareAverage(double[] x, double[] y) {
		double sum1 = 0;
		for (double numbers : x) {
			sum1 += numbers;
		}
		double sum2 = 0;
		for (double numbers : y) {
			sum2 += numbers;
		}
		double firstAverage = sum1 / x.length;
		double secondAverage = sum2 / y.length;
		
		if (firstAverage > secondAverage) {
			return true;
		}
		return false;
		
	}
	
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside = true && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
	
	/*This method would be especially useful for a leader board if the first place person fell to the back, I could expand it further and add another parameter and then it would change
	positions starting at whatever point we tell it to in the array.*/
	
	public static void moveUpOne(int[] n) {
		int first = n[0];
		for (int i = 0; i < n.length-1; i++) {
			 n[i] = n[i+1];
		}
		n[n.length-1] = first;
	
	}
}
