
/**
 * Main class for Ex122, implementing a deck of cards using 
 * Comparable interface.
 */

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static Hand createHand() {
        Hand hand = new Hand();
        Random random = new Random();
        final String[] suits = {"Spades", "Diamonds", "Hearts", "Clubs"};
        final String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        
        for (int i = 0; i < 6; i++) {
            int suitIndex = random.nextInt(suits.length);
            int valueIndex = random.nextInt(values.length);
            String pickSuit = suits[suitIndex];
            String pickValue = values[valueIndex];
            hand.add(new Card(pickSuit, pickValue));
        }
        return hand;
    }

    public static void main(String[] args) {
        Hand player_1 = createHand();
        Hand player_2 = createHand();

        player_1.sort();
        player_2.sort();
        System.out.println("\nPlayer one hand: ");
        player_1.printHand();
        System.out.println("\nPlayer two hand: ");
        player_2.printHand();

        System.out.println("\nComparing hand values: ");
        System.out.println("Player one: " + player_1.handValue());
        System.out.println("Player two: " + player_2.handValue());
        int comparison = player_1.compareTo(player_2);
        if (comparison < 0) {
            System.out.println("Player two wins.");
        } else if (comparison > 0) {
            System.out.println("Player one wins.");
        } else {
            System.out.println("Draw.");
        }
    }
}