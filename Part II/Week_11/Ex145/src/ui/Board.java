
/**
 * Board class for Ex145
 */

package ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Board extends JPanel {
    private Avatar avatar;

    public Board(Avatar avatar) {
        super.setBackground(new Color(0x34495e));
        this.avatar = avatar;
    }

    @Override
    protected void paintComponent(Graphics gfx) {
        super.paintComponent(gfx);

        gfx.setColor(new Color(0xf1c40f));
        avatar.draw(gfx);
    }
}