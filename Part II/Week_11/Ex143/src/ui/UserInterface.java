
/**
 * UserInterface class for Ex143
 */

package ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class UserInterface implements Runnable, ActionListener {
    private JFrame frame;
    private JLabel current;
    private JTextArea entry;
    private Calculator calc;

    public UserInterface(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void run() {
        this.frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(200, 280));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        Font large = new Font("Source Code Pro", Font.PLAIN, 32);
        Font medium = new Font("Source Code Pro", Font.PLAIN, 22);

        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);

        this.current = new JLabel(this.calc.getValue(), JLabel.CENTER);
        current.setPreferredSize(new Dimension(200, 60));
        current.setFont(large);
        container.add(current);

        this.entry = new JTextArea("...");
        entry.setPreferredSize(new Dimension(160, 30));
        entry.setFont(medium);
        entry.setBorder(BorderFactory.createLoweredBevelBorder());
        container.add(entry);

        JButton addButton = new JButton("+");
        addButton.setPreferredSize(new Dimension(80, 35));
        addButton.setFont(medium);
        addButton.setActionCommand("+");
        container.add(addButton);

        JButton subButton = new JButton("-");
        subButton.setPreferredSize(new Dimension(80, 35));
        subButton.setFont(medium);
        subButton.setActionCommand("-");
        container.add(subButton);

        JButton mulButton = new JButton("*");
        mulButton.setPreferredSize(new Dimension(80, 35));
        mulButton.setFont(medium);
        mulButton.setActionCommand("*");
        container.add(mulButton);

        JButton divButton = new JButton("/");
        divButton.setPreferredSize(new Dimension(80, 35));
        divButton.setFont(medium);
        divButton.setActionCommand("/");
        container.add(divButton);

        JButton changeButton = new JButton("+/-");
        changeButton.setPreferredSize(new Dimension(80, 35));
        changeButton.setFont(medium);
        changeButton.setActionCommand("+/-");
        container.add(changeButton);

        JButton clearButton = new JButton("Clr");
        clearButton.setPreferredSize(new Dimension(80, 35));
        clearButton.setFont(medium);
        clearButton.setActionCommand("Clr");
        container.add(clearButton);

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        changeButton.addActionListener(this);
        clearButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("+")) {
            this.calc.add(this.entry.getText());
        } else if (command.equals("-")) {
            this.calc.subtract(this.entry.getText());
        } else if (command.equals("*")) {
            this.calc.multiply(this.entry.getText());
        } else if (command.equals("/")) {
            this.calc.divide(this.entry.getText());
        } else if (command.equals("+/-")) {
            this.calc.change();
        } else if (command.equals("Clr")) {
            this.calc.clear();
        }
        this.entry.setText("");
        this.current.setText(this.calc.getValue());
    }
}