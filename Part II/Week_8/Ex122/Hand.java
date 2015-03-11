
/**
 * Hand class for Ex122
 */

import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void printHand() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public int handValue() {
        int total = 0;
        for (Card card : this.cards) {
            total += card.getValue();
        }
        return total;
    }

    public int compareTo(Hand other) {
        int total_1 = this.handValue();
        int total_2 = other.handValue();

        if (total_1 < total_2) {
            return -1;
        } else if (total_1 > total_2) {
            return 1;
        } else {
            return 0;
        }

    }
}