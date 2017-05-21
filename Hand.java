import java.util.ArrayList;

public class Hand {
  
  private ArrayList<Card> cardsInHand;
  private String playerName;  
  private int cardValue;
  private int cardSuit;
  private String cardRank;
  private int handValue;

  Deck deck = new Deck();

  public Hand() {

  }
 
  public Hand(String playerName) {
    this.cardsInHand = new ArrayList<Card>();
    this.playerName =  playerName; 
    this.cardValue  = cardValue;
    this.cardSuit   = cardSuit;
    this.cardRank   = cardRank;
    this.handValue  = handValue;
  }

  public Card CardToHandFromDeck() {  
    Card newCard = deck.dealRandomCard();
    cardsInHand.add(newCard);
    return newCard;
  }


}