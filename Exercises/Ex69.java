
// Checks if a string is a palindrome or not!

import java.util.Collections;
import java.util.ArrayList;

public class Ex69 {

    public static boolean palindrome(String input) {
        ArrayList<Character> letters = new ArrayList<Character>();
        int i = 0;
        while (i < input.length()) {
            letters.add(input.charAt(i));
            i += 1;
        }
        ArrayList<Character> originalLetters = new ArrayList<Character>(letters);
        Collections.reverse(letters);
        System.out.println(originalLetters + "\n" + letters);
        if (originalLetters.equals(letters)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        String completeString = "";
        for (String arg : args) {
            completeString += arg.toLowerCase();
        }
        if (palindrome(completeString)) {
            System.out.println("String is a palindrome. :>");
        } else {
            System.out.println("String is not a palindrome. :<");
        }
    }
}