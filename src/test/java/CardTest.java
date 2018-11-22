import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.JACK);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.JACK, card.getRank());
    }

    @Test
    public void queenHasValue10 (){
        card = new Card(SuitType.HEARTS, RankType.JACK);
        assertEquals(11, card.getValueFromEnum());
    }
}
