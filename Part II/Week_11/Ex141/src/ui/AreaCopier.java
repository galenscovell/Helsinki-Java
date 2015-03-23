
/**
 * Areacopier class Ex141
 */

package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;


public class AreaCopier implements ActionListener {
    private JTextArea origin;
    private JLabel destination;

    public AreaCopier(JTextArea origin, JLabel destination) {
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.destination.setText(this.origin.getText());
        this.origin.setText("");
    }
}