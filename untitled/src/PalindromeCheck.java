public class PalindromeCheck {
    public static void main(String[] args) {
        // Input array
        int[] inputArray = {1, 2, 3, 2, 1};


        boolean isPalindrome = checkPalindrome(inputArray);

        // Print the output
        System.out.println("Is the array a palindrome? " + isPalindrome); // Output: True
    }

    public static boolean checkPalindrome(int[] array) {
        int left = 0;
        int right = array.length - 1; // End pointer

        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

