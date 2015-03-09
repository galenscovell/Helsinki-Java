
/**
 * Player class for Ex90
 */

public class Player {

    private String name;
    private int goals;

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }

    public Player(String name) {
        this.name = name;
        goals = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getGoals() {
        return this.goals;
    }

    public String toString() {
        return name + ", Goals: " + goals;
    }
}