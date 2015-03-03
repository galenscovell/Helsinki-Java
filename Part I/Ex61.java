
// Return number of items in argv arraylist, remove final item and return edited list

import java.util.Collections;
import java.util.ArrayList;

public class Ex61 {

    public static int countListSize(ArrayList<String> userList) {
        return userList.size();
    }


    public static ArrayList<String> removeLast(ArrayList<String> userList) {
        int length = userList.size();
        System.out.println("Removing: " + userList.get(length - 1));
        userList.remove(length - 1);
        return userList;
    }


    public static void main(String[] args) {
        ArrayList<String> userList = new ArrayList<String>();
        for (String arg : args) {
            userList.add(arg);
        }
        System.out.println("Items in list: " + countListSize(userList));
        System.out.println("Final list: " + removeLast(userList));
    }

}