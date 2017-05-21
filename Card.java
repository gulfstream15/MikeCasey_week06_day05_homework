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
      case "1":        
        value = 1;
        break;
      case "2": 
        value = 2;
        break;
      case "3": 
        value = 3;
        break;
      case "4": 
        value = 4;
        break;
      case "5": 
        value = 5;
        break;    
      case "6": 
        value = 6;
        break;     
      case "7": 
        value = 7;
        break;
      case "8": 
        value = 8;      
        break;
      case "9": 
        value = 9;
        break;       
      case "10": 
        value = 10;
        break;
      case "J": 
        value = 10;
        break;
      case "Q": 
        value = 10;
        break;
      case "K": 
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