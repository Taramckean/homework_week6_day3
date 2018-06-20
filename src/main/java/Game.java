import java.util.ArrayList;



public class Game {
    private ArrayList<Player> players;
    private Deck deck;
    private int i;
    private String winner;

    public Game(){
        this.players = new ArrayList<Player>();
        this.deck = new Deck();
        this.i = 0;
    }


    public int countPlayers() {
        return this.players.size();
    }

    public void addPlayers(Player player){
        players.add(player);
    }

    public String winningHand() {
        for (Player person : players){
            if(person.getHandValue() > i){
                 winner = person.getName();
                 i = i + person.getHandValue();
            }

        }
        return winner;

    }
}

