import java.util.ArrayList;

public class Card {
    
  private int value;
  private String rank;
  private String suit;

  public Card(String rank, String suit) {
    this.rank = rank; 
    this.value = value; 
    this.suit = suit;
  }

  public String getRank() {
    return this.rank;
  }

  public void setRank(String newRank) {
    this.rank = newRank;
  }

  public int getValue(String rank) {
    //Logic for ace 1 or 10?
    switch(rank) {
      case "ACE":        
        value = 1;
        break;
      case "TWO": 
        value = 2;
        break;
      case "THREE": 
        value = 3;
        break;
      case "FOUR": 
        value = 4;
        break;
      case "FIVE": 
        value = 5;
        break;    
      case "SIX": 
        value = 6;
        break;     
      case "SEVEN": 
        value = 7;
        break;
      case "EIGHT": 
        value = 8;      
        break;
      case "NINE": 
        value = 9;
        break;       
      case "TEN": 
        value = 10;
        break;
      case "JACK": 
        value = 10;
        break;
      case "QUEEN": 
        value = 10;
        break;
      case "KING": 
        value = 10;
        break;                   
    }
    return value;   
  }

  public void setValue(int newValue) {
    this.value = newValue;
  }  

  public String getSuit() {
    return this.suit;
  }

  public void setSuit(String newSuit) {
    this.suit = newSuit;
  }
 
}