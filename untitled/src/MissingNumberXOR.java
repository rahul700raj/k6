public class MissingNumberXOR {
    public static void main(String[] args) {

        int[] inputArray = {1, 2, 4, 5};
        int N = 5;


        int missingNumber = findMissingNumber(inputArray, N);


        System.out.println("Missing number: " + missingNumber); // Output: 3
    }

    public static int findMissingNumber(int[] array, int N) {
        int xorArray = 0;
        int xorFull = 0;


        for (int num : array) {
            xorArray ^= num;
        }


        for (int i = 1; i <= N; i++) {
            xorFull ^= i;
        }

        return xorArray ^ xorFull;
    }
}

