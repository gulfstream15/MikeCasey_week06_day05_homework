import java.util.*;

public class Deck {

  private ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();
  }

  public void addCard(Card card){
      deck.add(card);
  }

  public int cardCount(){
     return deck.size();
   }




}