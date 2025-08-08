import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(2);
        inputList.add(3);
        inputList.add(3);


        List<Integer> uniqueList = removeDuplicates(inputList);


        System.out.println(uniqueList); // Output: [1, 2, 3]
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {

        Set<Integer> uniqueSet = new HashSet<>(list);

        return new ArrayList<>(uniqueSet);
    }
}

