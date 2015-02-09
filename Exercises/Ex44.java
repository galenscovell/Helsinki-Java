
// Of user-defined values, return smallest value

import java.util.Scanner;

public class Ex44 {

    public static int least(int num1, int num2) {
        if (num1 == num2) {
            return 0;
        } else if (num1 > num2) {
            return num2;
        } else {
            return num1;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nFirst value: ");
        int first = Integer.parseInt(input.nextLine());
        System.out.print("Second value: ");
        int second = Integer.parseInt(input.nextLine());

        int result = least(first, second);
        if (result == 0) {
            System.out.println("Values are equal.\n");
        } else {
            System.out.println("Smallest value is " + result + ".\n");
        }
    }
}