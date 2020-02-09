
public class BooleanOperations {

	public static void main(String[] args) {
		
		
		//******VARIABLES******//
		int currentTemp = 70;
		double moneyInWallet = 234.54;
		int thirstLevel = 7;
		double costOfMilk = 3.75;
		String day = "Saturday";
		
		
		
		boolean isHotOutside = currentTemp > 85;
		boolean isWeekday = !((day.equals("Saturday")) || (day.equals("Sunday")));
		boolean hasMoneyInPocket = moneyInWallet > 0;
		
		boolean shouldBuyIcecream = hasMoneyInPocket && isHotOutside;
		boolean willGoSwimming = isHotOutside && isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (2 * costOfMilk); 
		
		
		//******OUTPUT******//		
		
		System.out.println("The current temperature outside is " +  currentTemp + " degrees, is it hot outside (Temperature above 85)? " + isHotOutside);
		System.out.println("Do you currently have money in your wallet? " + hasMoneyInPocket + ". Amount: $" + moneyInWallet + ". With the current temperature should you buy ice cream? " + shouldBuyIcecream + ".");
		System.out.println("With the current day being " + day + ", and a temperature of " + currentTemp + " degrees, would you go swimming? " + willGoSwimming);
		System.out.println("With the price of milk being $" + costOfMilk + ", a temperature of " + currentTemp + ", and a thirst level of " + thirstLevel + " should you buy milk? " + willBuyMilk);

	}

}
