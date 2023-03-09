package two;

public class Card {

    private Suits suit;
    private int rank;

    public Card(Suits suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }
    public String toString(){
        return "Card: suit = " + suit + ", rank = " + rank;
    }
}