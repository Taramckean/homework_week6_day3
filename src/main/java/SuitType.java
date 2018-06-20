public enum SuitType {
    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    SPADES("Spades"),
    CLUBS("Clubs");

    private final String name;

    SuitType(String name){
        this.name = name;
    }

    public String getSuit() {
        return name;
    }

}


