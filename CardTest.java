import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class CardTest {

  Card card;

  @Before
  public void before() {
    card = new Card ("JACK", "HEARTS");
  }

  @Test
  public void canGetRank() {
    card.setRank("JACK");
    assertEquals("JACK", card.getRank());
  }

  @Test
  public void canGetSuit() {
    card.setSuit("CLUBS");
    assertEquals("CLUBS", card.getSuit());
  }

  @Test
  public void canGetAceValue(){
    int value = card.getValue("ACE");
    assertEquals(1, value);
  }

  @Test
  public void canGetQueenValue(){
    int value = card.getValue("QUEEN");
    assertEquals(10, value);
  }

}