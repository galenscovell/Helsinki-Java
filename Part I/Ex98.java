
/**
 * Ex98, reversing and copying arrays
 */

import java.util.Arrays;

public class Ex98 {

    public static int[] reverseCopy(int[] array) {
        int[] newArray = new int[array.length];

        int pos = 0;
        for (int i = array.length; i > 0; i--) {
            newArray[pos] = array[i - 1];
            pos++;
        }
        return newArray;
    }

    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }


    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverseCopied = reverseCopy(original);

        copied[0] = 5;

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copied: " + Arrays.toString(copied));
        System.out.println("Reverse copied: " + Arrays.toString(reverseCopied));
    }
}