public class arrayindex {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        try {

            int value = arr[10];
            System.out.println("Value at index 10: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index!");
        }
    }
}
