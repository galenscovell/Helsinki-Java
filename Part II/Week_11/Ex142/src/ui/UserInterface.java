
/**
 * UserInterface class for Ex142
 */

package ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class UserInterface implements Runnable, ActionListener {
    private JFrame frame;
    private Calculator calc;
    private JLabel counter;

    public UserInterface(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(200, 180));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void createComponents(Container container) {
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);

        this.counter = new JLabel("0", JLabel.CENTER);
        counter.setPreferredSize(new Dimension(100, 80));
        Font largerText = new Font("Source Code Pro", Font.PLAIN, 28);
        counter.setFont(largerText);
        container.add(counter);

        JButton addButton = new JButton("Add");
        addButton.setPreferredSize(new Dimension(80, 30));
        addButton.setActionCommand("add");
        container.add(addButton);

        JButton subButton = new JButton("Sub");
        subButton.setPreferredSize(new Dimension(80, 30));
        subButton.setActionCommand("sub");
        container.add(subButton);

        addButton.addActionListener(this);
        subButton.addActionListener(this);
    }

    public JFrame getFrame() {
        return frame;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        if (command.equals("add")) {
            this.calc.add();
        } else if (command.equals("sub")) {
            this.calc.sub();
        }
        counter.setText(this.calc.getValue());
    }
}