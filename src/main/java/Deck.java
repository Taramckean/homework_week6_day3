import java.util.ArrayList;
import java.util.Random;


public class Deck {
    private ArrayList<Card> pop;


    public Deck(){
        this.pop = new ArrayList<Card>();
    }


    public int checkSize() {
        return this.pop.size();
    }

    public void addCard(Card card1) {
        this.pop.add(card1);
    }

    public Card dealDeck(){
        int i = new Random().nextInt(this.checkSize());
        return this.pop.remove(i);

    }
}
