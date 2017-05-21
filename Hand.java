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

  public void addCardToHandFromDeck() {
    Card newCard = deck.dealRandomCard();
    cardsInHand.add(newCard); 
  }

  public int HandSize() {
    return cardsInHand.size();
  }

  public int getCardValue() {
    for (Card card:cardsInHand) {
      cardRank = card.getRank();
      System.out.println("cardRank is: " +cardRank);
      cardValue = card.getValue(cardRank);
      System.out.println("cardValue in class is: " +cardValue);
    }
    return cardValue;
  }
  

}