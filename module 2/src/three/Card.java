package three;
import two.Suits;

import java.util.Objects;

public abstract class Card {

    Suits suit;

    public Card(Suits suit) {
        this.suit = suit;
    }
    public Card(){

    }
    public boolean equals(Object obj) {
        if (obj instanceof Card suitName){
            if (Objects.equals(this.suit, suitName.suit)){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return "Card: suit = " + suit;
    }
}