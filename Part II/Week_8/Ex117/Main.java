
/**
 * Main class for Ex117, working with interfaces
 */

public class Main {

    public static void main(String[] args) {
        CivilService civService = new CivilService();
        MilitaryService milService = new MilitaryService();

        System.out.println("Days of civil service remaining: " + civService.getDaysLeft());
        System.out.println("Days of military service remaining: " + milService.getDaysLeft());

        for (int i = 0; i < 56; i++){
            if (i % 2 == 0) {
                civService.work();
            }
            milService.work();
        }

        System.out.println("Days of civil service remaining: " + civService.getDaysLeft());
        System.out.println("Days of military service remaining: " + milService.getDaysLeft());
    }
}