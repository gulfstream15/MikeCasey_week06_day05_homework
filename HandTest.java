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
    Card newCard = hand.CardToHandFromDeck();
    System.out.println("newCard in test is "+ newCard);
    // assertNotNull(hand.addCardToHandFromDeck()); 
  }


}
