
// Calculate average of numbers using helper methods

public class Ex46 {

    public static int sum(int num1, int num2, int num3, int num4) {
        int output = num1 + num2 + num3 + num4;
        return output;
    }

    public static double average(int num1, int num2, int num3, int num4) {
        int total = sum(num1, num2, num3, num4);
        double avg = (total / 4.0);
        return avg;
    }


    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}