
// Returns lengths of string elements in argv arraylist

import java.util.Collections;
import java.util.ArrayList;

public class Ex65 {

    public static int countLength(String element) {
        return element.length();
    }


    public static void main(String[] args) {
        ArrayList<Integer> lengths = new ArrayList<Integer>();
        for (String element : args) {
            lengths.add(countLength(element));
        }
        System.out.println(lengths);
    }
}