public class MoveZeros {
    public static void main(String[] args) {

        int[] inputArray = {0, 1, 0, 3, 12};


        moveZerosToEnd(inputArray);


        System.out.print("Output: {");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);
            if (i < inputArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void moveZerosToEnd(int[] array) {
        int nonZeroIndex = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex] = array[i];
                nonZeroIndex++;
            }
        }


        for (int i = nonZeroIndex; i < array.length; i++) {
            array[i] = 0;
        }
    }
}

