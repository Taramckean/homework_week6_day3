import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;

    Player player1;
    Player player2;

    Deck deck;

    Card card1;
    Card card2;
    Card card3;

    @Before
    public void setup() {
        game = new Game();
        player1 = new Player("Roddy");
        player2 = new Player("Tara");
        deck = new Deck();
        card1 = new Card(SuitType.CLUBS, RankType.TEN);
        card2 = new Card(SuitType.DIAMONDS, RankType.NINE);
        card3 = new Card(SuitType.SPADES, RankType.SEVEN);
        deck.addCard(card1);
        deck.addCard(card2);
        deck.addCard(card3);
        game.addPlayers(player1);
        game.addPlayers(player2);
    }

    @Test
    public void gameHasNoFriends() {
        assertEquals(2, game.countPlayers());
    }

    @Test
    public void gameCanCompareHandValues(){
        assertEquals("roddy", game.winningHand());

    }

}
