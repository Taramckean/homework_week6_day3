
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card1;
    Card card2;

    @Before
    public void setup(){
        deck = new Deck();
        card1 = new Card(SuitType.SPADES, RankType.ACE);
        card2 = new Card(SuitType.HEARTS, RankType.THREE);
        deck.addCard(card1);
        deck.addCard(card2);
    }

//    @Test
//    public void deckIsEmpty(){
//        assertEquals(0, deck.checkSize());
//    }

    @Test
    public void canPopulateDeck(){
        assertEquals(2, deck.checkSize());
    }

    @Test
    public void canSampleDeck(){
        assertEquals(card1, this.deck.dealDeck());

    }



}
