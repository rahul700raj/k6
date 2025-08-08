import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String input = "swiss";
        char result = firstNonRepeatingChar(input);
        System.out.println("The first non-repeating character is: '" + result + "'");
    }

    public static char firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();


        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }


        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }


        throw new IllegalArgumentException("No non-repeating character found");
    }
}

