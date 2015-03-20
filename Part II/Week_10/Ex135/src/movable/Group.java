
/**
 * Group class for Ex135
 */

package movable;

import java.util.ArrayList;
import java.util.List;


public class Group implements Movable {
    private List<Movable> organisms;

    public Group() {
        this.organisms = new ArrayList<Movable>();
    }

    public String toString() {
        String organismList = "";
        for (Movable organism : this.organisms) {
            organismList += "\n" + organism;
        }
        return organismList;
    }

    public void add(Movable movable) {
        this.organisms.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable organism : this.organisms) {
            organism.move(dx, dy);
        }
    }
}