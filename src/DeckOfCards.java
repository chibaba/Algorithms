import java.security.SecureRandom;

public class DeckOfCards {

	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;

	//random number generator
	private static final SecureRandom randomNumbers = new SecureRandom();

	//constructor fills deck of cards
	public DeckOfCards() {
		String[] faces = {"Ace", "Deuce", "three", "four", "five", "six",
				"seven", "eight", "nine", "ten", "jack", "Queen", "king"
		};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spade"};

		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0; // first card dealt will be deck[0]

		// populate the deck with card objects
		for (int count = 0; count < deck.length; count++)
			deck[count] =
					new Card(faces[count % 13], suits[count / 13]);
	}
	//SHUFFLE DECK OF CARDS WITH ONE PASS ALGORITHM
	public void shuffle()
	{
		//next call to method deal card should start at deck[0] again
		currentCard = 0;
		//for each card pick another random card(0 -51) and swap them
		for (int first = 0; first < deck.length; first++)
		{
			// select a random number between (0 -51)
			int Second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			// SWAP CURRENT CARD WITH RANDOMLY SELECTED CARD
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	//deal one card
	public  Card dealCard()
	{
		//determine whether cards remain to be dealt
		if(currentCard < deck.length)
			return  deck[currentCard++];
		else
			return null;
	}

}