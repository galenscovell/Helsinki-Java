
/**
 * Database for bird storage in Ex103.
 */

import java.util.ArrayList;

public class Database {
    
    private ArrayList<Bird> birdList;

    public Database() {
        this.birdList = new ArrayList<Bird>();
    }

    public void add(Bird bird) {
        this.birdList.add(bird);
    }

    public void observation(String name) {
        boolean found = false;
        for (Bird bird : birdList) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                found = true;
            }
        }

        if (found == false) {
            System.out.println("Bird not found in database.");
        }
    }

    public void search(String name) {
        boolean found = false;
        for (Bird bird : birdList) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                found = true;
            }
        }

        if (found == false) {
            System.out.println("Bird not found in database.");
        }
    }

    public void statistics() {
        for (Bird bird : birdList) {
            System.out.println(bird);
        }
    }
}