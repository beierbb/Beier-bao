package three;

import two.Suits;

public class Face extends Card {
    String face;
    public Face(Suits suits, String face) {
        super(suits);
        this.face = face;
    }
    @Override
    public String toString(){
        return "Card: suit = " + suit + ", rank = " + face;
    }
}
