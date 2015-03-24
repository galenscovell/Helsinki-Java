
/**
 * Main class for Ex144, drawing a smiley face on a board
 */

import ui.*;

import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);
    }
}