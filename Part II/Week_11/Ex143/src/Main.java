
/**
 * Main class for Ex143, creation of an interactive calculator in swing
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