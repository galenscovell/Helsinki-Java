
/**
 * StringUtils helper class for Ex101
 */

public class StringUtils {

    public static boolean included(String word, String searched) {
        String formatString = searched.toLowerCase().trim();
        if (word.toLowerCase().contains(formatString)) {
            return true;
        } else {
            return false;
        }
    }
}