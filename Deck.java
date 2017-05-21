import java.util.ArrayList;
import java.util.Random;

public class Deck {

  CardSuit suit;
  CardRank rank;
  private ArrayList<Card> deck;
  private Random randomGenerator = new Random();
 
  public Deck() {
    this.deck = new ArrayList<Card>();
    // createDeck();
  }
 
  public void addCard(Card card){
    deck.add(card);
  }

  public int deckSize(){
    return deck.size();
  }

  public void createDeck(){
    for (CardSuit suit : CardSuit.values()) {
      for (CardRank rank : CardRank.values()) {
         deck.add( new Card(rank.toString(), suit.toString()) );
      }
    }
  }

  public Card dealRandomCard() {
    int index = randomGenerator.nextInt(deck.size());
    Card card = deck.get(index);
    return card;
  }

}