package three;

import java.util.Comparator;
import java.util.Objects;

public abstract class Card implements Comparable<Card> {

    three.Suits suit;
    int suitValue;
    int value;
    //    Added value to make it easier to rank/compare
    public Card(three.Suits suit, int suitValue, int value) {
        this.suit = suit;
        this.suitValue = suitValue;
        this.value = value;
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
        return "Card: suit = " + suit + "value = " + value;
    }
}