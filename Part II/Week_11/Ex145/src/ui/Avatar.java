
/**
 * Avatar class for Ex145
 */

package ui;

import java.awt.Graphics;


public class Avatar {
    private int x;
    private int y;

    public Avatar(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void move(int addX, int addY) {
        this.x += addX;
        this.y += addY;
    }

    public void draw(Graphics gfx) {
        gfx.fillOval(this.x, this.y, 10, 10);
    }
}