
/**
 * Military Service class implementing National Service interface
 * for Ex117.
 */

public class MilitaryService implements NationalService {
    private int daysLeft;

    public MilitaryService() {
        this.daysLeft = 362;
    }

    public int getDaysLeft() {
        return this.daysLeft;
    }

    public void work() {
        if (this.daysLeft >= 1) {
            this.daysLeft -= 1;
        }
    }
}