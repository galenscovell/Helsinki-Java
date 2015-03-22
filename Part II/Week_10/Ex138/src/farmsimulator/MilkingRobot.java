
/**
 * Milking robot class for Ex138
 */

package farmsimulator;


public class MilkingRobot {
    private BulkTank tank;

    public MilkingRobot() {
        this.tank = null;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }

    public void milk(Milkable milkable) {
        try {
            this.tank.addToTank(milkable.milk());
        } catch (Exception e) {
            System.out.println("Milkbot has no tank set.");
        }
    }
}