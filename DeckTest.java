import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class DeckTest {
  
  Deck deck;
  Card card;
  
  @Before 
  public void before() {
    deck = new Deck();
  }

  @Test
  public void deckStartsEmpty(){
    assertEquals(0, deck.cardCount());
  }
  
  @Test
  public void canAddOneCard(){
    deck.addCard(card);
    assertEquals(1, deck.cardCount());
  }

  @Test
  public void canAddThreeCards(){
    deck.addCard(card);
    deck.addCard(card);
    deck.addCard(card);
    assertEquals(3, deck.cardCount());
  }

}