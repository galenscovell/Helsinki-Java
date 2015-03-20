
/**
 * Main class for Ex131, working with hashmaps and sets
 */

import dictionary.*;


public class Main {

    public static void main(String[] args) {
        MultipleEntryDictionary dict = new PersonalDictionary();
        dict.add("kuusi", "six");
        dict.add("kuusi", "spruce");

        dict.add("pii", "silicon");
        dict.add("pii", "pi");

        System.out.println(dict.translate("kuusi"));
        dict.remove("pii");
        System.out.println(dict.translate("pii"));
    }
}