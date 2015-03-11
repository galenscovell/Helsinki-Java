
package mooc.logic;

import mooc.ui.UserInterface;


/**
 * Application Logic class for Ex124.
 */


public class ApplicationLogic {
    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Application logic working.");
            this.ui.update();
        }
    }
}
