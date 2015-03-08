
/**
 * Main class for Ex112, introduction to HashMaps
 */

import java.util.HashMap;

public class Ex112 {

    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<String, String>();
        nicknames.put("Ashley", "Ash");
        nicknames.put("Dashiell", "Dash");
        nicknames.put("Galen", "G-man");

        System.out.println("Ashley's nickname is " + nicknames.get("Ashley"));
    }
}