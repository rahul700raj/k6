import java.util.LinkedHashSet;

public class DuplicateRemover {
    public static String removeDuplicates(String str) {

        LinkedHashSet<Character> charSet = new LinkedHashSet<>();


        for (char ch : str.toCharArray()) {
            charSet.add(ch);
        }


        StringBuilder result = new StringBuilder();
        for (char ch : charSet) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}

