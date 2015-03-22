
/**
 * Userinterface class for Ex140
 */

package ui;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class UserInterface implements Runnable {
    private JFrame frame;

    public UserInterface() {

    }

    @Override
    public void run() {
        this.frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(300, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Do you prefer Swing or Tkinter?"));

        JCheckBox swing = new JCheckBox("Swing");
        JCheckBox tkinter = new JCheckBox("Tkinter");
        JCheckBox neutral = new JCheckBox("Either is fine");

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(swing);
        buttonGroup1.add(tkinter);
        buttonGroup1.add(neutral);

        container.add(swing);
        container.add(tkinter);
        container.add(neutral);

        container.add(new JLabel("Why?"));

        JRadioButton java = new JRadioButton("I prefer Java");
        JRadioButton python = new JRadioButton("I prefer Python");
        JRadioButton similar = new JRadioButton("I like both Java and Python");

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(java);
        buttonGroup2.add(python);
        buttonGroup2.add(similar);

        container.add(java);
        container.add(python);
        container.add(similar);

        JButton submit = new JButton("Submit");
        container.add(submit);
    }

    public JFrame getFrame() {
        return frame;
    }
}