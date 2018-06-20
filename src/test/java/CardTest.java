import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before

    public void setup(){
        card = new Card(SuitType.DIAMONDS, RankType.TEN);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.DIAMONDS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.TEN, card.getRank());
    }

    @Test
    public void canGetValueFromEnum(){
        assertEquals(10, card.getValue());
    }

    @Test
    public void canGetNiceName(){
        assertEquals("Ten of Diamonds", card.niceName());
    }

}

