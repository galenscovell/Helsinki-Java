
/**
 * BinarySearch class for Ex106
 */

public class BinarySearch {

    public static int average(int first, int second) {
        int total = first + second;
        int mean = total / 2;
        return mean;
    }

    public static boolean search(int[] array, int value) {
        int lowerIndex = 0;
        int upperIndex = array.length - 1;
        int meanIndex;

        if (value == array[upperIndex] || value == array[lowerIndex]) {
            System.out.println("Value found at first or last index.");
            return true;
        }

        while (upperIndex - lowerIndex != 1) {
            meanIndex = average(lowerIndex, upperIndex);
            System.out.println("\nCheck index " + lowerIndex + "-" + upperIndex + ", " + "Value at mean index(" + meanIndex + "): " + array[meanIndex]);
            if (value > array[meanIndex]) {
                System.out.println(value + " > " + array[meanIndex]);
                lowerIndex = meanIndex;
            } else if (value < array[meanIndex]) {
                System.out.println(value + " < " + array[meanIndex]);
                upperIndex = meanIndex;
            } else if (value == array[meanIndex]) {
                System.out.println("Value found at mean index(" + meanIndex + ").");
                return true;
            } 
        }
        return false;
    }
}