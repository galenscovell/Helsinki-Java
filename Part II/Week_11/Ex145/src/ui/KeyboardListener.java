
/**
 * KeyboardListener for Ex145
 */

package ui;

import java.awt.Component;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyboardListener implements KeyListener {
    private Component component;
    private Avatar avatar;

    public KeyboardListener(Avatar avatar, Component component) {
        this.component = component;
        this.avatar = avatar;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.avatar.move(-5, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.avatar.move(5, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.avatar.move(0, -5);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.avatar.move(0, 5);
        }
        System.out.println("Keystroke: " + e.getKeyCode() + " pressed.");
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }
}


