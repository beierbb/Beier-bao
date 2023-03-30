package three;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<String> ranks = List.of(new String[]{"Jack", "Queen", "King"});
//        Create a new list and add the values in
        LinkedList<Card> cardList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            cardList.add(new Number(three.Suits.CLUBS, 3, i, i));
            cardList.add(new Number(three.Suits.DIAMONDS, 4, i, i));
            cardList.add(new Number(three.Suits.HEARTS, 2, i, i));
            cardList.add(new Number(three.Suits.SPADES, 1, i, i));
        }
        for (int i = 0; i < 3; i++) {
            cardList.add(new three.Face(three.Suits.CLUBS, 3, 11, ranks.get(i)));
            cardList.add(new three.Face(three.Suits.DIAMONDS, 4, 12, ranks.get(i)));
            cardList.add(new three.Face(three.Suits.HEARTS, 2, 13, ranks.get(i)));
            cardList.add(new three.Face(three.Suits.SPADES, 1, 14, ranks.get(i)));
        }
//        Can sort and print out the whole list
        SuitComparator s = new SuitComparator();
        Collections.sort(cardList, s);
        for (Card card : cardList) {
            System.out.println(card);
        }

//        polling 7 cards for 2.2
//        List<Card> polling = new ArrayList<>();
//        for (int i = 0; i < 7; i++) {
//            Card c = cardList.pollFirst();
//            polling.add(c);
//            System.out.println(c);
//        }
    }
}
