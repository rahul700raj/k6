import java.util.ArrayList;
public class ArrayListOperations {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        // Add elements to the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");


        System.out.println("ArrayList after adding elements: " + languages);

        // Remove "Python" from the ArrayList
        languages.remove("Python");


        System.out.println("ArrayList after removing 'Python': " + languages);


        int index = languages.indexOf("C++");
        if (index != -1) {
            languages.set(index, "Go");
        }
        System.out.println("ArrayList after updating 'C++' to 'Go': " + languages);
    }
}