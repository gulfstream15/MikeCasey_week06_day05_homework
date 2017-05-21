import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class HandTest {

  Hand hand;
  Deck deck;
  Card card;

  @Before
  public void before() {
    hand = new Hand ("Mike"); 
    deck = new Deck();
    card = new Card(); 
  }

  @Test
  public void handHasSize() {
    deck = new Deck();
    hand.addCardToHandFromDeck();
    int handSize = hand.HandSize();
    assertNotNull(handSize); 
  }

  // @Test
  // public void getCardSize() {
  //   card.CardToHandFromDeck();
  //   assertEquals(1, hand.HandSize());
  // }

  // @Test
  // public void cardHasValue() {
  //   int cardValue = hand.getCardValue();
  //   System.out.println("cardValue in test is: " +cardValue);
  //   assertNotNull(cardValue); 
  // }

}
