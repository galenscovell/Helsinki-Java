
// Asks user for sceret password until password is correctly entered...
// Then returns a secret message.

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String password = "carrot";

        while (true) {
            System.out.print("Type the password: ");
            String guess = reader.nextLine();

            if (guess.equals(password)) {
                System.out.println("Correct password.\n"); 
                break;
            } else {
                System.out.println("Incorrect password.\n");
            }

        }

        System.out.println("Secret message: This isn't really a secret.");              
    }
}