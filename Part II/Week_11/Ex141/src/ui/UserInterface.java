
/**
 * Userinterface class for Ex141
 */

package ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class UserInterface implements Runnable {
    private JFrame frame;

    public UserInterface() {

    }

    @Override
    public void run() {
        frame = new JFrame("Action Listeners");
        frame.setPreferredSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextArea areaTop = new JTextArea("Enter text here.");
        JLabel areaBottom = new JLabel("Text will be copied here.", JLabel.CENTER);
        JButton copyButton = new JButton("Copy");
        AreaCopier copier = new AreaCopier(areaTop, areaBottom);
        copyButton.addActionListener(copier);

        container.add(areaTop);
        container.add(copyButton);
        container.add(areaBottom);
    }

    public JFrame getFrame() {
        return frame;
    }
}