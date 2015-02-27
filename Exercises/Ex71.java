
/**
 * 'Smart' combines two arraylists, only adding value if not present in initial list.
 * >>> list1 = [1, 2, 3]
 * >>> list2 = [3, 3, 4]
 * >>> combine(list1, list2)
 * [1, 2, 3, 4]
 */

import java.util.Random;
import java.util.ArrayList;

public class Ex71 {

    public static ArrayList<Integer> smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> combined = new ArrayList<Integer>();
        combined.addAll(list1);
        
        for (int element : list2) {
            if (list1.contains(element)) {
                System.out.println(element + " already in list.");
            } else {
                combined.add(element);
            }
        }
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

        System.out.println(smartCombine(list1, list2));

    }
}