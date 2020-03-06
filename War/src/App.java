
public class App {

	public static void main(String[] args) {
		playWar("Shawn", "Michaela");
		System.out.println();
		
		playWar("Josh", "Nick");
		System.out.println();
		
		playWar("Bobby Hill", "Hank Hill");
		

		
	}
	
	public static void playWar(String player1, String player2) {
		Card playerOneCard;
		Card playerTwoCard;
		Deck theDeck = new Deck();
		Player playerOne = new Player(player1);
		Player playerTwo = new Player(player2);
		
		
		theDeck.shuffle();
		for(int i = 0; i < 26; i++) {
			playerOne.draw(theDeck);
			playerTwo.draw(theDeck);
		}
		playerOne.describe();
		System.out.println();
		playerTwo.describe();
		
		for(int i = 0; i < 26; i++) {
			playerOneCard = playerOne.flip();
			playerTwoCard = playerTwo.flip();
			if (playerOneCard.getValue() > playerTwoCard.getValue()) {
				playerOne.incrementScore();
			} else if (playerOneCard.getValue() < playerTwoCard.getValue()) {
				playerTwo.incrementScore();
			}
		}
		System.out.println();
		System.out.println("The Score for " + playerOne.getName() + " was: " + playerOne.getScore());
		System.out.println("The score for " + playerTwo.getName() + " was: " + playerTwo.getScore());
		if (playerOne.getScore() > playerTwo.getScore()){
			System.out.println("\n" + playerOne.getName() + " is the winner!");
		} else if ( playerOne.getScore() < playerTwo.getScore()) {
			System.out.println("\n" + playerTwo.getName() + " is the winner!");
		} else {
			System.out.println("\nIt looks like " + playerOne.getName() + " and " + playerTwo.getName() + " tied!\nTherefore the game is a draw!");
		}
	}


}
