import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        String[] array = {"a", "l", "g", "p", "c"};
        String recurringChar = getFirstRecurringChar(array);

        System.out.println("The first recurring character is: " + recurringChar);
    }

    public static String getFirstRecurringChar(String[] array) {
        HashMap<String, String> characters = new HashMap<>();
        String firstRecurringChar = null;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                String currentChar = array[i];
                if (characters.containsKey(currentChar)) {
                    firstRecurringChar = currentChar;
                    break;
                } else {
                    characters.put(currentChar, currentChar);
                }
            }
        } else {
            firstRecurringChar = null;
        }
        return firstRecurringChar;
    }
}
