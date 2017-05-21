import java.util.ArrayList;

public class Hand {
  
  private ArrayList<Card> hand;
  private String playerName;  
  private int cardValue;
  private int cardSuit;
  private int cardRank;
  private int handValue;

  Deck deck = new Deck();
  //Card card = new Card(); 

  public Hand() {

  }
 
  public Hand(String playerName) {
    this.playerName =  playerName; 
    this.cardValue = cardValue;
    this.cardSuit = cardSuit;
    this.cardRank = cardRank;
    this.handValue = handValue;
  }

  public Card CardToHandFromDeck() {  
    
    Card newCard = deck.dealRandomCard();
    System.out.println("newCard in class is "+ newCard);
    // hand.add(card);
    return newCard;
  }


}