package SumArray;

public class sumarray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};


        int sum = calculateSum(numbers);


        System.out.println("The sum of the array elements is: " + sum);
    }

    public static int calculateSum(int[] array) {
        int total = 0; // Initialize total to 0


        for (int num : array) {
            total += num;
        }
        return total;
    }
}
