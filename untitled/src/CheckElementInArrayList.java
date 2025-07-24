import java.util.ArrayList;

public class CheckElementInArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add elements
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Element to search for
        int searchElement = 20;

        // Call the method to check if the element exists
        int index = findElementIndex(numbers, searchElement);

        // Print the result
        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    // Method to find the index of an element in the ArrayList
    public static int findElementIndex(ArrayList<Integer> list, int element) {
        // Check if the list contains the element
        if (list.contains(element)) {
            return list.indexOf(element); // Return the index of the element
        } else {
            return -1; // Return -1 if the element is not found
        }
    }
}

