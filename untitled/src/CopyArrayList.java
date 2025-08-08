import java.util.ArrayList;
import java.util.List;

public class CopyArrayList {
    public static void main(String[] args) {

        List<Integer> listA = new ArrayList<>();
        listA.add(10);
        listA.add(20);


        List<Integer> listB = new ArrayList<>(listA);


        System.out.println("Cloned List B: " + listB);
    }
}

