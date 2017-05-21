import java.util.ArrayList;
import java.util.Random;

public class Deck {

  private ArrayList<Card> deck;
  private Random randomGenerator = new Random();
  private String rankArray[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; 
  private String suitArray[] = {"Hearts", "Clubs", "Spades", "Diamonds"};

  public Deck() {
    this.deck = new ArrayList<Card>();
    // Call from here?
    // createDeck();
  }
 
  public void addCard(Card card){
    deck.add(card);
  }

  public int deckSize(){
    return deck.size();
  }

  public void createDeck(){
    for (int i = 0; i < suitArray.length; i++) {       
      for (int j = 0; j < rankArray.length; j++) {
         deck.add( new Card(rankArray[j], suitArray[i]) );
      }
    }
  }

  public Card getRandomCard() {
    int index = randomGenerator.nextInt(deck.size());
    Card card = deck.get(index);
    return card;
  }

}