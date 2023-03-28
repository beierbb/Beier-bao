package three;

import two.Card;
import two.Face;
import two.Number;
import two.Suits;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<String> ranks = List.of(new String[]{"Jack", "Queen", "King"});
//        Create a new list and add the values in
        List<two.Card> cardList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            cardList.add(new Number(Suits.CLUBS, i));
            cardList.add(new Number(Suits.DIAMONDS, i));
            cardList.add(new Number(Suits.HEARTS, i));
            cardList.add(new Number(Suits.SPADES, i));
        }
        for (int i = 0; i < 3; i++) {
            cardList.add(new two.Face(Suits.CLUBS, ranks.get(i)));
            cardList.add(new two.Face(Suits.DIAMONDS, ranks.get(i)));
            cardList.add(new two.Face(Suits.HEARTS, ranks.get(i)));
            cardList.add(new Face(Suits.SPADES, ranks.get(i)));
        }
        LinkedList<two.Card> cardLinkedList = new LinkedList<>(cardList);
//        Can print out the whole list if uncomment the lines below

//        Iterator<Card> iterator = cardLinkedList.iterator();
//        while (iterator.hasNext()){
//            Card card = iterator.next();
//            System.out.println(card);
//        }

//        polling 7 cards
        List<two.Card> polling = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Card c = cardLinkedList.pollFirst();
            polling.add(c);
            System.out.println(c);
        }
    }
}
//create 2 customer comparators one that sorts by suits and numerical value.
// Order is Spades, Hearts, Clubs, Diamonds.