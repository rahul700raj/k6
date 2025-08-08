public class StringComparator {
    public static boolean compareIgnoreCase(String str1, String str2) {

        return str1.equalsIgnoreCase(str2);
    }

    public static void main(String[] args) {

        String input1 = " death is begning";
        String input2 = " life is end";
        boolean result = compareIgnoreCase(input1, input2);
        System.out.println("Input: \"" + input1 + "\", \"" + input2 + "\"");
        System.out.println("Are Equal (Ignoring Case): " + result);
    }
}

