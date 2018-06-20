import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private int handValue;
    private Card x;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.handValue = 0;
    }

    public int countHand() {
        return this.hand.size();
    }

    public void addCardToHand(Deck deck){
        x = deck.dealDeck();
        this.hand.add(x);
        this.handValue += x.getRank().getValue();
    }

    public int getHandValue() {
        return this.handValue;
    }

    public String getName() {
        return this.name;
    }
}
