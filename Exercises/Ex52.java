
// Reverses a user-defined string

import java.util.Scanner;

public class Ex52 {

    public static String reverseString(String input) {
        int i = input.length() - 1;
        String newString = "";
        while (i >= 0) {
            newString += input.charAt(i);
            i--;
        }
        return newString;
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter some text: ");
        String userInput = reader.nextLine();
        String reversed = reverseString(userInput);
        System.out.println("Reversed string: " + reversed + "\n");
    }
}