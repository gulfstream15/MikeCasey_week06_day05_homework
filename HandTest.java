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
  public void canGetCardFromDeck() {
    deck = new Deck();
    Card newCard = hand.CardToHandFromDeck();
    assertNotNull(newCard); 
  }

  // @Test
  // public void cardHasValue() {
  //   // int cardValue = hand.getCardValue();
  //   // assertNotNull(cardValue); 
  // }

}
