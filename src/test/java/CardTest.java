import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, Rank.JACK);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.JACK, card.getRank());
    }

    @Test
    public void queenHasValue10 (){
        card = new Card(SuitType.HEARTS, Rank.JACK);
        assertEquals(10, card.getValueFromEnum());
    }
}
