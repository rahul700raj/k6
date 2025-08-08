public class VowelCounter {
    public static int countVowels(String str) {
        int count = 0;


        str = str.toLowerCase();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String input = "Hello World";
        int result = countVowels(input);
        System.out.println("Input: " + input);
        System.out.println("Number of Vowels: " + result);
    }
}

