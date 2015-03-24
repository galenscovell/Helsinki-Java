
/**
 * DrawingBoard class for Ex144
 */

package ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(new Color(0x34495e));
    }

    @Override
    protected void paintComponent(Graphics gfx) {
        super.paintComponent(gfx);

        gfx.setColor(new Color(0x2ecc71));
        gfx.fillRect(80, 70, 20, 20);
        gfx.fillRect(180, 70, 20, 20);
        gfx.fillRect(40, 130, 20, 20);
        gfx.fillRect(220, 130, 20, 20);
        gfx.fillRect(60, 150, 160, 20);
    }
}