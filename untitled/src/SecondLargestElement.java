public class SecondLargestElement {
        public static void main(String[] args) {

            int[] numbers = {5, 7, 2, 9, 1};


            int secondLargest = findSecondLargest(numbers);


            System.out.println("The second largest element in the array is: " + secondLargest);
        }
        public static int findSecondLargest(int[] array) {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : array) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num < largest) {
                    secondLargest = num;
                }
            }

            return secondLargest;
        }
    }

