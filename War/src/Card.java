
public class Card {
	private int value;
	private String name;
	private String suit;
	
	public Card(){

	}
	
	
	
	public void describe() {
		System.out.println("The card is a " + this.name + " of " + this.suit);
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
		
		//Sets the name based off value of the card.
		if(value == 2) {
			this.name = "Two";
		}else if (value == 3) {
			this.name = "Three";
		}else if (value == 4) {
			this.name = "Four";
		}else if (value == 5) {
			this.name = "Five";
		}else if (value == 6) {
			this.name = "Six";
		}else if (value == 7) {
			this.name = "Seven";
		}else if (value == 8) {
			this.name = "Eight";
		}else if (value == 9) {
			this.name = "Nine";
		}else if (value == 10) {
			this.name = "Ten";
		}else if (value == 11) {
			this.name = "Jack";
		}else if (value == 12) {
			this.name = "Queen";
		}else if (value == 13) {
			this.name = "King";
		}else if (value == 14) {
			this.name = "Ace";
		}
		
	}
	public String getName() {
		return name;
	}

	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
}
