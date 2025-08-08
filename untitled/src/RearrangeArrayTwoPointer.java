import java.util.Arrays;

public class RearrangeArrayTwoPointer {
    public static void main(String[] args) {

        int[] inputArray = {1, -1, 3, -2, 5};


        rearrangeArray(inputArray);


        System.out.println("Output: " + Arrays.toString(inputArray));
    }

    public static void rearrangeArray(int[] array) {
        int left = 0;
        int right = 0;

        while (right < array.length) {
            if (array[right] < 0) {

                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
            }
            right++;
        }
    }
}

