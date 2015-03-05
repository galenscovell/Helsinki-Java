
/**
 * Main class for Ex104, creation of selection sort.
 */

import java.util.Arrays;

public class Ex104 {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            swap(array, i, smallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

    public static int smallestFrom(int[] array, int index) {
        int smallest = sum(array);
        int smallestIndex = index;
        for (int passes = 2; passes > 0; passes--) {
            for (int i = index; i < array.length; i++) {
                int value = array[i];
                if (value < smallest) {
                    smallest = value;
                    smallestIndex = i;
                }
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int value1 = array[index1];
        int value2 = array[index2];
        array[index1] = value2;
        array[index2] = value1;
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int value : array) {
            total += value;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] values = {8, 1, 3, 7, 9, 1, 2, 4, 10, 5};
        System.out.println(Arrays.toString(values));
        selectionSort(values);
    }
}