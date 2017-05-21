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
    assertEquals(0, deck.deckSize());
  }
  
  @Test
  public void canAddOneCard(){
    deck.addCard(card);
    assertEquals(1, deck.deckSize());
  }

  @Test
  public void canCreateDeck(){
    deck.createDeck();
    assertEquals(5, deck.deckSize());
  }

  @Test
  public void getDeckSize(){
    deck.createDeck();
    assertEquals(5, deck.deckSize());
  }

}