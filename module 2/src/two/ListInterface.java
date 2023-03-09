package two;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<Card> cardList = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            cardList.add(new Card(Suits.CLUBS, i));
            cardList.add(new Card(Suits.DIAMONDS, i));
            cardList.add(new Card(Suits.HEARTS, i));
            cardList.add(new Card(Suits.SPADES, i));
        }
        Iterator<Card> iterator = cardList.iterator();
        LinkedList<Card> cardLinkedList = new LinkedList<>(cardList);
        System.out.println(cardLinkedList.peekFirst());
    }
}
