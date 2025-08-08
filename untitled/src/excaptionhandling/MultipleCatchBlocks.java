public class MultipleCatchBlocks {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        try {

            int result = 10 / 0; //


            int value = arr[10];

        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index!");
        }
    }
}
