
/**
 * Barn class for Ex138
 */

package farmsimulator;

import java.util.Collection;


public class Barn {
    private MilkingRobot milkbot;
    private BulkTank tank;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkbot) {
        milkbot.setBulkTank(this.tank);
        this.milkbot = milkbot;
    }

    public void takeCareOf(Cow cow) {
        try {
            this.milkbot.milk(cow);
        } catch (Exception e) {
            System.out.println("Milkbot hasn't been installed.");
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        try {
            for (Cow cow : cows) {
                this.milkbot.milk(cow);
            }
        } catch (Exception e) {
            System.out.println("Milkbot hasn't been installed.");
        }
    }

    public String toString() {
        return "Barn bulk tank: " + this.tank;
    }
}