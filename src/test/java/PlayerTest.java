import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;
    Card card1;
    Card card2;
    Card card3;

    @Before
    public void setup(){
        player = new Player("Roddy");
        deck = new Deck();
        card1 = new Card(SuitType.CLUBS, RankType.TEN);
        card2 = new Card(SuitType.DIAMONDS, RankType.TEN);
        card3 = new Card(SuitType.SPADES, RankType.TEN);
        deck.addCard(card1);
        deck.addCard(card2);
        deck.addCard(card3);
    }


    @Test
    public void canAddCardToHand(){
        player.addCardToHand(deck);
        assertEquals(1, this.player.countHand());
    }

    @Test
    public void canAddToHandValue(){
        player.addCardToHand(deck);
        assertEquals(10, this.player.getHandValue());
    }

    @Test
    public void canGetName(){
        assertEquals("Roddy", player.getName());
    }

}
