import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C"};


        List<String> list = Arrays.asList(arr);
        ArrayList<String> arrayList = new ArrayList<>(list);


        System.out.println("ArrayList: " + arrayList);
    }
}

