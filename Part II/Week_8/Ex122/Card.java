
/**
 * Card class for Ex122
 */

public class Card implements Comparable<Card> {
    private int intValue;
    private String stringValue;
    private int intSuit;
    private String stringSuit;

    public Card(String suit, String value) {
        this.stringSuit = suit;
        this.intSuit = convertSuitToInt(this.stringSuit);
        this.stringValue = value;
        this.intValue = convertValueToInt(this.stringValue);
    }

    private int convertSuitToInt(String suit) {
        String[] suitValues = {"Spades", "Diamonds", "Hearts", "Clubs"};
        for (int i = 0; i < suitValues.length; i++) {
            if (suitValues[i].equals(suit)) {
                return i;
            }
        }
        System.out.println("Invalid suit value.");
        System.exit(0);
        return -1;
    }

    private int convertValueToInt(String value) {
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(value)) {
                return i + 2;
            }
        }
        System.out.println("Invalid card value.");
        System.exit(0);
        return -1;
    }

    public int getSuit() {
        return this.intSuit;
    }

    public int getValue() {
        return this.intValue;
    }

    public int compareTo(Card other) {
        if (this.intSuit < other.intSuit) {
            return -1;
        } else if (this.intSuit > other.intSuit) {
            return 1;
        } else {
            if (this.intValue < other.intValue) {
                return -1;
            } else if (this.intValue > other.intValue) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return this.stringValue + " of " + this.stringSuit;
    }
}