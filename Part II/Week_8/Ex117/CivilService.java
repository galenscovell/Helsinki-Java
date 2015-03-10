
/**
 * Civil Service class which implmenents National Service interface
 * for Ex117.
 */

public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService() {
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