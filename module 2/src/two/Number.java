package two;

public class Number extends Card{
    int number;
    public Number(Suits suits, int number) {
        super(suits);
        this.number = number;
    }
    @Override
    public String toString(){
        return "Card: suit = " + suit + ", rank = " + number;
    }

}
