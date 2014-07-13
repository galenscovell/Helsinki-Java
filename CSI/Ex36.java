
// Ask for user-input integers until -1 is entered.
// At this point the program ends and several values are calculated
// based on input up to that point.

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Give me some numbers to chew on!\n");
        int food = 0;
        int sum = 1;
        int count = -1;
        int even = 0;
        int odd = -1;

        while (food != -1) {
            food = Integer.parseInt(reader.nextLine());
            sum += food;
            count++;
            if (food % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Yuck! You expect me to eat that?");
        System.out.println("In total, I ate: " + sum);
        System.out.println("And you fed me " + count + " numbers.");
        System.out.println("The average of my food was " + (sum / count) + ".");
        System.out.println("Even food eaten: " + even);
        System.out.println("Odd food eaten: " + odd);
    }
}