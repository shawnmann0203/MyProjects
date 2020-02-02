
public class App {

	public static void main(String[] args) {
		
		//***Variables and Data***//
		double itemOne = 27.40;
		double itemTwo = 30.99;
		double walletOne = 100;
		double walletTwo = 150;
		int friendsOne = 63;
		int friendsTwo = 45;
		int ageOne = 29;
		int ageTwo = 26;
		String firstNameOne = "Shawn";
		String firstNameTwo = "Michaela";
		String lastNameOne = "Stroh";
		String lastNameTwo = "Plumley";
		char middleInitialOne = 'H';
		char middleInitialTwo = 'L';
		
		//***Operations**//
		double moneyLeftOne = walletOne - itemOne; 
		double moneyLeftTwo = walletTwo - itemTwo;
		double averageOne = friendsOne / ageOne;
		double averageTwo = friendsTwo / ageTwo;
		String fullNameOne = firstNameOne + " " + middleInitialOne + ". " + lastNameOne;
		String fullNameTwo = firstNameTwo + " " + middleInitialTwo + ". " + lastNameTwo;
		
		//**Output**//
		System.out.println("Item one's price: $" + itemOne);
		System.out.println("Item two's price: $" + itemTwo);
		System.out.println("The amount of money in wallet one is: $" + walletOne);
		System.out.println("The amount of money in wallet two is: $" + walletTwo);
		System.out.println("The first person has " + friendsOne + " friends.");
		System.out.println("The second person has " + friendsTwo + " friends.");
		System.out.println("First person's age is " + ageOne);
		System.out.println("Second person's age is " + ageTwo);
		System.out.println("First person's first name is " + firstNameOne);
		System.out.println("Second person's first name is " + firstNameTwo);
		System.out.println("First person's last name is " + lastNameOne);
		System.out.println("Second person's last name is " + lastNameTwo);
		System.out.println("First person's middle initial is " + middleInitialOne);
		System.out.println("Second person's middle initial is " + middleInitialTwo);
		System.out.println("Starting with $" + walletOne + ", The first person would have $" + moneyLeftOne + " after purchasing item one for $" + itemOne);
		System.out.println("Starting with $" + walletTwo + ", The first person would have $" + moneyLeftTwo + " after purchasing item one for $" + itemTwo);
		System.out.println("The first person made an average of " + averageOne + " friends per year.");
		System.out.println("The second person made an average of " + averageTwo + " friends per year");
		System.out.println("The first person's full name is " + fullNameOne);
		System.out.println("The second person's full name is " + fullNameTwo);
		
	}

}
