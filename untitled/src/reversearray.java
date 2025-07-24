public class reversearray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        reverseArray(numbers);
        System.out.print("Reversed array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void reverseArray(int[] array) {
        int start = 0; // Initialize start index
        int end = array.length - 1;
        while (start < end) {
            // Swap elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }
}
