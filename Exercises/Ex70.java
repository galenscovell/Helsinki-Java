
/*
 * Combines two arraylists.
 * >>> list1 = [1, 2, 3]
 * >>> list2 = [4, 5, 6]
 * >>> combine(list1, list2)
 * [1, 2, 3, 4, 5, 6]
 */

import java.util.Random;
import java.util.ArrayList;

public class Ex70 {

    public static ArrayList<Integer> combine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> combined = new ArrayList<Integer>();
        combined.addAll(list1);
        combined.addAll(list2);
        return combined;
    }

    public static void main(String[] args) {
        Random randomGenerator = new Random();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        while (list1.size() < 4) {
            int rand_num = randomGenerator.nextInt(10);
            list1.add(rand_num * 4);
        }

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        while (list2.size() < 4) {
            int rand_num = randomGenerator.nextInt(10);
            list2.add(rand_num * 4);
        }

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(combine(list1, list2));

    }
}