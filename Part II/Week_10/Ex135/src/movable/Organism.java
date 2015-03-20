
/**
 * Organism class for Ex135
 */

package movable;


public class Organism implements Movable {
    private int posX;
    private int posY;

    public Organism(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    public String toString() {
        return "Organism at [" + this.posX + ", " + this.posY + "]";
    }

    public void move(int dx, int dy) {
        this.posX += dx;
        this.posY += dy;
    }
}