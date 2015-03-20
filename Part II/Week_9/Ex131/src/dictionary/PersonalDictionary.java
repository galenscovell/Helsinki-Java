
/**
 * Dictionary for Ex131
 */

package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class PersonalDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> contents;

    public PersonalDictionary() {
        this.contents = new HashMap<String, Set<String>>();
    }

    public void add(String word, String entry) {
        if (!this.contents.containsKey(word)) {
            this.contents.put(word, new HashSet<String>());
        }

        Set<String> entries = this.contents.get(word);
        entries.add(entry);
    }

    public Set<String> translate(String choice) {
        for (String word : this.contents.keySet()) {
            if (word.equals(choice)) {
                return this.contents.get(word);
            }
        }
        return null;
    }

    public void remove(String choice) {
        this.contents.remove(choice);
    }
}