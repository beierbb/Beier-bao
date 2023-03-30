package three;

public class Number extends Card {
    int number;
//    Added value and suitValue to make it easier to rank/compare
    public Number(Suits suits, int suitValue, int value, int number) {
        super(suits, suitValue, value);
        this.number = number;
    }
    @Override
    public String toString(){
        return "Card: suit = " + suit + ", rank = " + number;
    }

    @Override
    public int compareTo(Card o) {
        if (this.value > o.value){
            return 1;
        }
        else if (this.value < o.value){
            return -1;
        }
        return 0;
    }
}
