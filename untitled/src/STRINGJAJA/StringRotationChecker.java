public class StringRotationChecker {
    public static boolean isRotation(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;


        return concatenated.contains(str2);
    }

    public static void main(String[] args) {

        String input1 = "devil";
        String input2 = "king";
        boolean result = isRotation(input1, input2);
        System.out.println("Input: \"" + input1 + "\", \"" + input2 + "\"");
        System.out.println("Is Rotation: " + result);
    }
}

