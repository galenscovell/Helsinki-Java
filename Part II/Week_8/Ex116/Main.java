
/**
 * Main class for Ex116, overwriting inherited methods through
 * custom implementations of equals() and hashCode().
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("JPN", "78 WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate other = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(other)) {
            finnish.add(other);
        }

        System.out.println("Finnish: " + finnish);

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Kenji");

        System.out.println("Owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("JPN", "78 WQ-431")));
}
    }