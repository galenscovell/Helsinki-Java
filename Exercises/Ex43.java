
// Calculate sum of numbers using method with return value

public class Ex43 {

    public static int sum(int num1, int num2, int num3, int num4) {
        int output = num1 + num2 + num3 + num4;
        return output;
    }


    public static void main(String[] args) {
        int answer= sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
    }
}