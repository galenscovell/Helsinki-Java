
// Calculates sum and average of argv list of values

import java.util.ArrayList;
import java.util.Collections;

public class Ex63 {

    public static Double sum(ArrayList<Double> nums) {
        Double total = 0.0;
        for (Double num : nums) {
            total += num;
        }
        return total;
    }


    public static Double average(ArrayList<Double> nums) {
        Double total = 0.0;
        int length = nums.size();
        for (Double num : nums) {
            total += num;
        }
        return (total / length);
    }


    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<Double>();
        for (String arg : args) {
            Double num_arg = Double.valueOf(arg);
            nums.add(num_arg);
        }
        System.out.format("Sum of values: %.2f", sum(nums));
        System.out.format("\nAverage of values: %.2f\n", average(nums));
    }
}