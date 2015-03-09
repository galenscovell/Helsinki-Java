
/**
 * Team class for Ex90
 */

import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize = 16;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (this.players.size() < this.maxSize) {
            this.players.add(player);
        } else {
            System.out.println("Team is already at max size.");
        }
    }

    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    public int totalGoals() {
        int total = 0;
        for (Player player : players) {
            total += player.getGoals();
        }
        return total;
    }
}