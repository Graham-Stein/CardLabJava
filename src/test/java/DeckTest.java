import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void setup() {
        deck = new Deck();
    }

    @Test
    public void hasEmptyDeckOfCards() {
        assertEquals(0, deck.getDeckOfCards().size());
    }

    @Test
    public void canAddACardToDeck() {
        deck.addCard(SuitType.HEARTS, RankType.JACK);
        assertEquals(1, deck.getDeckOfCards().size());
    }

    @Test
    public void canPopulateDeck() {
        deck.populateDeck();
        assertEquals(52, deck.getDeckOfCards().size());
    }

    @Test
    public void shuffleDeckReturns52Cards() {
        deck.populateDeck();
        deck.shuffleDeck();
        assertEquals(52, deck.getDeckOfCards().size());
    }

    @Test
    public void canDealCard(){
        deck.populateDeck();
        deck.shuffleDeck();
        Card card = deck.dealCard();
        assertEquals(51, deck.getDeckOfCards().size());
    }


}
