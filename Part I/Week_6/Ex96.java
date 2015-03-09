
/**
 * Ex96, summing array values
 */

public class Ex96 {

    public static int sum(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }


    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }
}