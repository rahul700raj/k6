public class CaseToggler {
    public static String toggleCase(String str) {

        StringBuilder toggledString = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {

                toggledString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {

                toggledString.append(Character.toUpperCase(ch));
            } else {

                toggledString.append(ch);
            }
        }

        return toggledString.toString();
    }

    public static void main(String[] args) {

        String input = "rahul mishra";
        String result = toggleCase(input);
        System.out.println("Input: " + input);
        System.out.println("Toggled Case: " + result);
    }
}

