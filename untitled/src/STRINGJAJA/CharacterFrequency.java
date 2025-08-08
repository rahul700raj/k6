import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void printFrequency(String str) {

        Map<Character, Integer> frequencyMap = new HashMap<>();


        str = str.toLowerCase();


        for (char ch : str.toCharArray()) {
            // Update the frequency count in the map
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }


        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void main(String[] args) {

        String input = "Apple";
        System.out.println("Input: " + input);
        System.out.println("Character Frequencies:");
        printFrequency(input);
    }
}
