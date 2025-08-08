import java.util.ArrayList;

public class CheckArrayListEquality {
    public static void main(String[] args) {

        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(2);
        listA.add(3);

        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(1);
        listB.add(2);
        listB.add(3);


        if (listA.equals(listB)) {
            System.out.println("Output: Equal"); // Output: Equal
        } else {
            System.out.println("Output: Not Equal");
        }
    }
}

