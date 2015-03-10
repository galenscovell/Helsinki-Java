
/**
 * Dictionary class for Ex114
 */

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dict;

    public Dictionary() {
        this.dict = new HashMap<String, String>();
    }

    public String translate(String word) {
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        } else {
            return "Word not found.";
        }
    }

    public void add(String word, String translation) {
        this.dict.put(word, translation);
    }

    public int amountOfWords() {
        return this.dict.size();
    }

    public ArrayList<String> list() {
        ArrayList<String> contents = new ArrayList<String>();
        for (String key : dict.keySet()) {
            contents.add(key + " = " + dict.get(key));
        }
        return contents;
    }
}