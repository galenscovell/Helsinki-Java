
/**
 * UserInterface class for Ex144
 */

package ui;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class UserInterface implements Runnable {
    private JFrame frame;

    public UserInterface() {

    }

    @Override
    public void run() {
        this.frame = new JFrame("Drawing Board");
        frame.setPreferredSize(new Dimension(300, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.add(new DrawingBoard());
    }
}