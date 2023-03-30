package three;

public class Face extends Card {
    String face;
    //    Added value and suitValue to make it easier to rank/compare
    public Face(Suits suits, int suitValue, int value, String face) {
        super(suits, suitValue, value);
        this.face = face;
    }
    @Override
    public String toString(){
        return "Card: suit = " + suit + ", rank = " + face;
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
