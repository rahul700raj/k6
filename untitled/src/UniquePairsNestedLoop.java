import java.util.ArrayList;
import java.util.List;

public class UniquePairsNestedLoop {
    public static void main(String[] args) {

        int[] inputArray = {2, 4, 3, 5, 7};
        int targetSum = 7;


        List<String> pairs = findUniquePairs(inputArray, targetSum);


        System.out.println("Output: " + pairs); // Output: [(2, 5), (4, 3)]
    }

    public static List<String> findUniquePairs(int[] array, int targetSum) {
        List<String> result = new ArrayList<>();
        int n = array.length;


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] + array[j] == targetSum) {
                    result.add("(" + array[i] + ", " + array[j] + ")");
                }
            }
        }

        return result;
    }
}

