import java.util.*;

public class Deck {

  private ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();
  }

  public void addCard(Card card){
    deck.add(card);
  }

  public int deckSize(){
    return deck.size();
  }

  public void createDeck(){
    deck.add(new Card("1"));
    deck.add(new Card("2"));
    deck.add(new Card("3"));
    deck.add(new Card("4"));
    deck.add(new Card("5"));
  }

  

}