
/**
 * Main class for Ex138, more work with inheritance and interfaces
 * through a farm simulation (tanks, cows, milking robots, barns and farms).
 */

import farmsimulator.*;

import java.util.LinkedList;


public class Main {

    public static void main(String[] args) {
        Farm farm = new Farm("Galen", new Barn(new BulkTank()));
        MilkingRobot robot = new MilkingRobot();
        farm.installMilkingRobot(robot);

        farm.addCow(new Cow());
        farm.addCow(new Cow());
        farm.addCow(new Cow());

        farm.liveHour();
        farm.liveHour();

        farm.manageCows();

        System.out.println(farm);
    }
}