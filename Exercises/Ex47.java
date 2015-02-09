
// Returns length of user-defined string as well as first and last chars

import java.util.Scanner;

public class Ex47 {

    public static int countChars(String input) {
        return input.length();
    }


    public static char firstChar(String input) {
        return input.charAt(0);
    }


    public static char lastChar(String input) {
        int length = input.length();
        return input.charAt(length - 1);
    }


    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nType something: ");
        String userInput = input.nextLine();
        int result = countChars(userInput);
        char first = firstChar(userInput);
        char last = lastChar(userInput);
        System.out.println(result + " characters entered.");
        System.out.println(first + " was the first character.");
        System.out.println(last + " was the last character.\n");
    }
}