public class CountEvenOdd {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Call the method to count even and odd numbers
        int[] counts = countEvenOdd(numbers);

        // Print the results
        System.out.println("Even = " + counts[0] + ", Odd = " + counts[1]);

    }

    public static int[] countEvenOdd(int[] array) {
        int evenCount = 0; // Counter for even numbers
        int oddCount = 0;  // Counter for odd numbers

        // Loop through the array to count even and odd numbers
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++; // Increment even counter
            } else {
                oddCount++;  // Increment odd counter
            }
        }
        return new int[]{evenCount, oddCount};
    }
}

