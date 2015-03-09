
// A year is a leap year if it is divisible by 4. But if the year is divisible // by 100, it is a leap year only when it is also divisible by 400.

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Year: ");
        int year = Integer.parseInt(reader.nextLine());

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("Year is not a leap year.");
            } else {
                System.out.println("Year is a leap year.");
            }
        } else {
            System.out.println("Year is not a leap year.");
        }
        
    }
}