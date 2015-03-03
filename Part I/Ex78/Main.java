
/**
 * Main class for Ex78, a clock built with OO design principles
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.println("Initial seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.println("Initial minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.println("Initial hours: ");
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
            i++;
        }
    }
}