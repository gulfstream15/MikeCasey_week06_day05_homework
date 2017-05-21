import java.util.ArrayList;

public class Hand {
  
  private ArrayList<Card> cardsInHand;
  private String playerName;  
  private int cardValue;
  private String cardSuit;
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

  public void addCardToHandFromDeck() {
    Card newCard = deck.dealRandomCard();
    cardsInHand.add(newCard); 
  }

  public int HandSize() {
    return cardsInHand.size();
  }

  public void setCardDetails() {
    for (Card card:cardsInHand) {
      this.cardSuit = card.getSuit();
      this.cardRank = card.getRank();
      this.cardValue = card.getValue(cardRank);
      System.out.println("cardSuit is:" + cardSuit);
      System.out.println("cardRank is:" + cardRank);
      System.out.println("cardValue is:" + cardValue);
    }
  }
 
  public String getCardSuit() {
    return this.cardSuit;  
  }

  public String getCardRank() {
    return this.cardRank;  
  }

  public int getCardValue() {
    return this.cardValue;  
  }
  
  
}