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
  // Loop here for suits
    deck.add(new Card("A"));
    deck.add(new Card("2"));
    deck.add(new Card("3"));
    deck.add(new Card("4"));
    deck.add(new Card("5"));
    deck.add(new Card("6"));
    deck.add(new Card("7"));
    deck.add(new Card("8"));
    deck.add(new Card("9"));
    deck.add(new Card("10"));
    deck.add(new Card("J"));
    deck.add(new Card("Q"));
    deck.add(new Card("K"));
  }

  

}