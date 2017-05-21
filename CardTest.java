import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class CardTest {

  Card card;

  @Before
  public void before() {
    card = new Card ("1");
  }

  @Test
  public void canGetOneValue(){
    int value = card.getValue("1");
    assertEquals(1, value);
  }

  @Test
  public void canGetQueenValue(){
    int value = card.getValue("Q");
    assertEquals(10, value);
  }

}