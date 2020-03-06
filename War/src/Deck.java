import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<>();
	
	public Deck () {
		for (int i = 0; i < 52; i++) {
			cards.add(new Card());
		}
		int suitSetter = 1;
		int cardValue = 2;
		for (Card card : cards) {
			card.setValue(cardValue);
			
			//set the suit of each card
			if (suitSetter == 1) {
				card.setSuit("Diamonds");
			} else if (suitSetter == 2) {
				card.setSuit("Spades");
			} else if (suitSetter == 3) {
				card.setSuit("Hearts");
			} else if (suitSetter == 4) {
				card.setSuit("Clubs");
			}
			cardValue++;
			if(cardValue > 14) {
				cardValue = 2;
				suitSetter++;
				
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card drawCard = cards.get(0);
		cards.remove(0);
		return drawCard;
		
	}
}
