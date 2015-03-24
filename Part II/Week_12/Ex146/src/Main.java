
/**
 * Main class for Ex146, working with regular expressions
 */

import java.util.regex.*;


public class Main {

    public static boolean isWeekDay(String string) {
        if (string.matches("Mon|Tue|Wed|Thu|Fri")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean allVowels(String string) {
        if (string.matches("(a|e|i|o|u)+")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean clockTime(String string) {
        if (string.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("\nTue is weekday: " + isWeekDay("Tue"));
        System.out.println("Gab is weekday: " + isWeekDay("Gab"));

        System.out.println("\naeai is all vowels: " + allVowels("aeai"));
        System.out.println("uoira is all vowels: " + allVowels("uoira"));

        System.out.println("\n13:24:01 is clock format: " + clockTime("13:24:01"));
        System.out.println("132401 is clock format: " + clockTime("132401"));
        System.out.println("13:2401 is clock format: " + clockTime("13:2401"));
        System.out.println("1324:01 is clock format: " + clockTime("1324:01"));
        System.out.println("ab:cd:ef is clock format: " + clockTime("ab:cd:ef"));
    }
}