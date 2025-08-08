import java.util.ArrayList;

public class CommonValuesRetainAll {
    public static void main(String[] args) {
        
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(2);
        listA.add(3);

        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(2);
        listB.add(3);
        listB.add(4);


        ArrayList<Integer> commonValues = new ArrayList<>(listA);
        commonValues.retainAll(listB);


        System.out.println("Output: " + commonValues);
    }
}

