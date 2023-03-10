package two;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<String> ranks = List.of(new String[]{"Jack", "Queen", "King"});
//        Create a new list and add the values in
        List<Card> cardList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            cardList.add(new Number(Suits.CLUBS, i));
            cardList.add(new Number(Suits.DIAMONDS, i));
            cardList.add(new Number(Suits.HEARTS, i));
            cardList.add(new Number(Suits.SPADES, i));
        }
        for (int i = 0; i < 3; i++) {
            cardList.add(new Face(Suits.CLUBS, ranks.get(i)));
            cardList.add(new Face(Suits.DIAMONDS, ranks.get(i)));
            cardList.add(new Face(Suits.HEARTS, ranks.get(i)));
            cardList.add(new Face(Suits.SPADES, ranks.get(i)));
        }
        LinkedList<Card> cardLinkedList = new LinkedList<>(cardList);
//        Can print out the whole list if uncomment the lines below

//        Iterator<Card> iterator = cardLinkedList.iterator();
//        while (iterator.hasNext()){
//            Card card = iterator.next();
//            System.out.println(card);
//        }

//        polling 7 cards
        List<Card> polling = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Card c = cardLinkedList.pollFirst();
            polling.add(c);
            System.out.println(c);
        }
    }
}
