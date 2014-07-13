
// Prints all even numbers between 2 and 100

public class Ex29 {
    public static void main(String[] args) {

        int num = 1;
        while (num < 101) {
            if (num % 2 == 0) {
                System.out.println("Current number: " + num);
                num++;
            } else {
                num++;
            }
        }
    }
}