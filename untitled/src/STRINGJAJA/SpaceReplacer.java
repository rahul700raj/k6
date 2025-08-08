public class SpaceReplacer {
    public static String replaceSpaces(String str) {

        return str.replace(" ", "-");
    }

    public static void main(String[] args) {

        String input = "death is begning";
        String result = replaceSpaces(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}

