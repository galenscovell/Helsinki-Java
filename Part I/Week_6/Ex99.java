
/**
 * Ex99, printing stars matching integer array values
 */

public class Ex99 {

    public static void printArrayAsStars(int[] array) {
        for (int element : array) {
            while (element > 0) {
                System.out.print("*");
                element--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }
}