public class StringReverser {
    public static String reverse(String str) {

        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;


        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }


        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "coding";
        String output = reverse(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
