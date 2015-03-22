
/**
 * Farm class for Ex138
 */

package farmsimulator;

import java.util.ArrayList;


public class Farm {
    private String owner;
    private Barn barn;
    private ArrayList<Cow> cows;

    public Farm(String name, Barn barn) {
        this.owner = name;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }

    public void manageCows() {
        this.barn.takeCareOf(this.cows);
    }

    public void liveHour() {
        for (Cow cow : this.cows) {
            cow.liveHour();
        }
    }

    public String toString() {
        String returnString = "\nFarm owner: " + this.owner + "\nBarn bulk tank: " + this.barn + "\nCows: \n";
        for (Cow cow : this.cows) {
            returnString += "\t" + cow + "\n";
        }
        return returnString;
    }
}