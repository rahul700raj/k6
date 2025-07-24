public class MaxValueInArray {
    public static void main(String[] args) {
        // Define the integer array
        int[] numbers = {10, 5, 40, 25};

        // Call the method to find the maximum value
        int maxValue = findMaxValue(numbers);

        // Print the result
        System.out.println("The maximum value in the array is: " + maxValue);
    }

    // Method to find the maximum value in the array
    public static int findMaxValue(int[] array) {
        int max = array[0]; // Initialize max with the first element

        // Loop through the array to find the maximum value
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if current element is greater
            }
        }

        return max; // Return the maximum value
    }
}



