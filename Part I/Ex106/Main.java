
/**
 * Main class for Ex106, implementation of binary search.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {-8, -3, 2, 3, 4, 7, 8, 9, 12, 21};
        Scanner reader = new Scanner(System.in);

        System.out.println(Arrays.toString(array));
        System.out.print("\n\nSearch for: ");
        String searchedValue = reader.nextLine();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));

        System.out.println("\n" + searchedValue + " is in array: " + result + "\n\n");
    }
}