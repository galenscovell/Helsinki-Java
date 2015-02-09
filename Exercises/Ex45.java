
// Of user-defined values, return largest value

import java.util.Scanner;

public class Ex45 {

    public static int greatest(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            return 0;
        } else if (num1 > num2 && num1 > num2) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nFirst value: ");
        int first = Integer.parseInt(input.nextLine());
        System.out.print("Second value: ");
        int second = Integer.parseInt(input.nextLine());
        System.out.print("Third value: ");
        int third = Integer.parseInt(input.nextLine());

        int result = greatest(first, second, third);
        if (result == 0) {
            System.out.println("Values are equal.\n");
        } else {
            System.out.println("Largest value is " + result + ".\n");
        }
    }
}