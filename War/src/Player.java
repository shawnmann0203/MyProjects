import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<>();
	private int score = 0;
	private String name;
	
	public Player() {
		
	}
	
	public Player(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Name of the player: " + this.name + ". \nList of cards in hand:");
		for(Card card : hand) {
			card.describe();
		}
	}
	
	public String getName() {
		return this.name;
	}
	public void  setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public Card flip() {
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;
	}
	public void draw(Deck deck) {
		hand.add(deck.draw());
		
	}
	
	public void incrementScore() {
		score++;
	}
}
