
/**
 * Main class for Ex142, implementation of a click counter
 */

import ui.*;

import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        UserInterface ui = new UserInterface(calc);
        SwingUtilities.invokeLater(ui);
    }
}