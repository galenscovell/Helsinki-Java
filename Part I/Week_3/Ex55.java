
// Returns whether or not a string is within another string

import java.util.Scanner;

public class Ex55 {

    public static boolean checkString(String input1, String input2) {
        if (input1.length() == input2.length()) {
            return false;
        } else if (input1.indexOf(input2) != -1) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("\nMain word: ");
        String first = reader.nextLine();
        System.out.print("Searched word: ");
        String second = reader.nextLine();
        boolean check = checkString(first, second);
        if (check) {
            System.out.println("The word '" + second + "' is found in the word '" + first + "'.\n");
        } else {
            System.out.println("The word '" + second + "' is not found in the word '" + first + "'.\n");
        }
    }
}