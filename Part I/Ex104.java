
/**
 * Main class for Ex104, creation of selection sort.
 */

import java.util.Arrays;

public class Ex104 {

    public static int smallestFrom(int[] array, int index) {
        int smallestValue = array[index];
        int smallestIndex = index;
        for (int i = index; i < array.length; i++) {
            int current = array[i];
            if (current < smallestValue) {
                smallestValue = current;
                smallestIndex = i;
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

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            swap(array, i, smallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] values = {8, 1, 3, 7, 9, 1, 2, 4, 10, 5};
        System.out.println(Arrays.toString(values));
        selectionSort(values);
    }
}