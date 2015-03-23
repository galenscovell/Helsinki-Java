
/**
 * Main class for Ex141, action listeners and action events
 */

import ui.*;

import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);
    }
}